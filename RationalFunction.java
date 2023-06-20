public class RationalFunction extends Function{

    private Function numFunction;

    private Function denomFunction;

    public RationalFunction(Function numFunction, Function denomFunction){
        super(numFunction.coefficients, numFunction.power, numFunction.canvas);
        this.numFunction = numFunction;
        this.denomFunction = denomFunction;
    }

    public float evaluateFunction(float x){
        float numerator = numFunction.evaluateFunction(x);
        float denominator = denomFunction.evaluateFunction(x);
        return numerator/denominator;
    }

    public void plotFunction(int numPoints){
        super.plotFunction(numPoints);
    }

    public void setWindow(float xMin, float xMax, float yMin, float yMax){
        super.setWindow(xMin, xMax, yMin, yMax);
    }

    public void printFunction(){
        numFunction.printFunction();
        System.out.print("  /  ");
        denomFunction.printFunction();
    }
}