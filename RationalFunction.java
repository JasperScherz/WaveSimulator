public class RationalFunction extends Function{

    private float[] denomCoefficients;

    private int denomPower;

    public RationalFunction(float[] numCoefs, float[] denomCoefficients, int numStartingPower, int denomStartingPower, SimpleCanvas canvas){
        super(numCoefs, numStartingPower, canvas);
        this.denomCoefficients = denomCoefficients;
        this.denomPower = denomStartingPower;
    }

    public float evaluateFunction(float x){
        float numerator = super.evaluateFunction(x);
        int denomPower1 = denomPower;
        float denominator = 0;
        for(float coefficient:denomCoefficients){
            float value = x;

            if(denomPower1 > 0) {
                for (int i = 1; i < denomPower1; i++) {
                    value *= x;
                }
            }else if(denomPower1 < 0){
                for (int i = 1; i > denomPower1; i--) {
                    value /= x;
                }
            } else {
                value = 1;
            }
            denomPower1++;
            denominator += coefficient * value;
        }
        return numerator/denominator;
    }

    public void plotFunction(int numPoints){
        super.plotFunction(numPoints);
    }

    public void setWindow(float xMin, float xMax, float yMin, float yMax){
        super.setWindow(xMin, xMax, yMin, yMax);
    }

    public void printFunction(){
        super.printFunction();
        int denomPower1 = denomCoefficients.length - 1;
        System.out.print("  /  ");
        for(int i = denomCoefficients.length - 1; i > 0 ; i--){
            System.out.print(denomCoefficients[i] + "x^" + denomPower1 + " + ");
            denomPower1--;
        }
        System.out.print(denomCoefficients[0] + "x^" + denomPower1);
    }
}