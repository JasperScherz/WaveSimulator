public class RationalFunction extends Function{

    private float[] denomCoefs;

    private int denomPower;

    public RationalFunction(float[] numCoefs, float[] denomCoefs, int numStartingPower, int denomStartingPower, SimpleCanvas canvas){
        super(numCoefs, numStartingPower, canvas);
        this.denomCoefs = denomCoefs;
        this.denomPower = denomStartingPower;
    }

    public float evaluateFunction(float x){
        float numerator = super.evaluateFunction(x);
        int denomPower1 = denomPower;
        float denominator = 0;
        for(float coef:denomCoefs){
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
            denominator += coef * value;
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

    }
}