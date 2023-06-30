public class RationalFunction extends Function{

    private Function numFunction;

    private Function denomFunction;

    public RationalFunction(Function numFunction, Function denomFunction, SimpleCanvas canvas){
        super(numFunction.coefficients, numFunction.power, canvas);
        this.numFunction = numFunction;
        this.denomFunction = denomFunction;
    }

    public double evaluateFunction(double x){
        double numerator = numFunction.evaluateFunction(x);
        double denominator = denomFunction.evaluateFunction(x);
        return numerator/denominator;
    }

    public void plotFunction(int numPoints){
        super.plotFunction(numPoints);
    }

    public void setWindow(double xMin, double xMax, double yMin, double yMax){
        super.setWindow(xMin, xMax, yMin, yMax);
    }

    public void printFunction(){
        numFunction.printFunction();
        System.out.print("  /  ");
        denomFunction.printFunction();
    }
}