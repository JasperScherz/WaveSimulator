public class Function {

    private float[] coefficients;

    private SimpleCanvas canvas;

    private int power;

    private static float xMin, xMax, yMin, yMax;

    private static int width, height, xConversion, yConversion;

    public Function(float[] coefficients, int startingPower, SimpleCanvas canvas){
        this.coefficients = coefficients;
        this.canvas = canvas;
        this.power = startingPower;
        Function.width = canvas.getWidth();
        Function.height = canvas.getHeight();
        setWindow(-10, 10, -10, 10);

        Function.xConversion = (int)(width/(xMax - xMin));
        Function.yConversion = (int)(height/(yMax - yMin));
    }

    public float evaluateFunction(float x){
        int power1 = power;
        float total = 0;
        for(float coef:coefficients){
            float value = x;

            if(power1 > 0) {
                for (int i = 1; i < power1; i++) {
                    value *= x;
                }
            } else if(power1 < 0){
                for (int i = 1; i > power1; i--) {
                    value /= x;
                }
            } else {
                value = 1;
            }
            power1++;
            total += coef * value;
        }
        return total;
    }

    public void plotFunction(int numPoints){

        //Draws xAxis
        for (int i = 0; i < (xMax - xMin); i++) {
            if(i != -xMin) {
                canvas.drawLine(xConversion * i, (int)(yConversion*-yMin) - 10, xConversion * i, (int)(yConversion*-yMin) + 10);
            } else{
                canvas.drawLine(xConversion * i, 0, xConversion * i, height);
            }
        }

        //Draws yAxis
        for (int i = 0; i < (yMax-yMin); i++) {
            if(i != -yMin) {
                canvas.drawLine((int)(xConversion*-xMin) - 10, yConversion * i, (int)(xConversion*-xMin) + 10, yConversion * i);
            } else{
                canvas.drawLine(0, yConversion * i, width, yConversion * i);
            }
        }

        //Draws Function
        for(float i = numPoints * xMin; i < numPoints*(xMax+1); i++){
            float x = i/numPoints;
            float x2 = (i+1)/numPoints;

            canvas.drawLine(xCoord(x),  yCoord(x), xCoord(x2), yCoord(x2));
            canvas.drawFilledCircle(xCoord(x), yCoord(x), 5);

        }
        canvas.show();
    }

    private int xCoord(float x){
       return (int)(xConversion * (x - xMin));
    }

    private int yCoord(float x){
        float yValue = evaluateFunction(x);
        return (int)((yConversion*-yValue) + (yConversion*-yMin));
    }

    public void setWindow(float xMin, float xMax, float yMin, float yMax){
        Function.xMin = xMin;
        Function.xMax = xMax;
        Function.yMin = yMin;
        Function.yMax = yMax;
        Function.xConversion = (int)(width/(xMax - xMin));
        Function.yConversion = (int)(height/(yMax - yMin));
    }

    public void printFunction(){
        int power1 = power;
        System.out.print("f(x) = ");
        for (int i = 0; i < coefficients.length - 1; i++) {
            System.out.print(coefficients[i] + "x^" + power1 + " + ");
            power1++;
        }
        System.out.print(coefficients[coefficients.length - 1] + "x^" + power1 + "\n");
    }
}
