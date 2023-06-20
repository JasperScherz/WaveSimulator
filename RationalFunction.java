public class RationalFunction extends Function{

    private float[] numCoeffs, denomCoeffs;

    //private SimpleCanvas canvas;

    private int denomPower;
 
    //private static float xMin, xMax, yMin, yMax;

    //private static int width, height, xConversion, yConversion;

    public RationalFunction(float[] numCoeffs, float[] denomCoeffs, int numStartingPower, int denomStartingPower, SimpleCanvas canvas){
        super(numCoeffs, numStartingPower, canvas);
        this.denomCoeffs = denomCoeffs;
        this.denomPower = denomPower;
        
   
/* 
        this.numCoeffs = numCoeffs;
        this.denomCoeffs = denomCoeffs;
        this.canvas = canvas;
        this.numPower = numStartingPower;
        this.denomPower = denomStartingPower;
        RationalFunction.width = canvas.getWidth();
        RationalFunction.height = canvas.getHeight();
        setWindow(-10, 10, -10, 10);

        RationalFunction.xConversion = (int)(width/(xMax - xMin));
        RationalFunction.yConversion = (int)(height/(yMax - yMin));
*/
    }

    public float evaluateFunction(float x){
        float numerator = super.evaluateFunction(x);
        return numerator;
    }

    public void plotFunction(int numPoints){
        super.plotFunction(numPoints);
    }

    private int xCoord(float x){
        return 0;
    }

    private int yCoord(float x){
        return 0;
    }

    public void setWindow(float xMin, float xMax, float yMin, float yMax){
        super.setWindow(xMin, xMax, yMin, yMax);
    }

    public void printFunction(){

    }
}