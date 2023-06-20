public class TrigFunction extends Function{

    private double counter;

    public TrigFunction(NPTS functionName, int numOfCoefficients, SimpleCanvas canvas){
        super(functionName.getCoefficients(numOfCoefficients), 0, canvas);
    }

    public double evaluateFunction(double x){
        double convertedX = (x - 3.1415) % 6.28;
        
        
        if(convertedX < 355/113){
            convertedX += 6.28;
        }

        if(convertedX > 355/113){
            convertedX -= 6.28;
        }
        double value = super.evaluateFunction(convertedX);
       /* if(convertedX2 > 3.14 && convertedX2 < 6.28){
            value *= -1;
        } 
        if(convertedX2 > 3.14 && convertedX < 0){
            value *= -1;
        }
        */
        return value;
    }

/* 
    public void plotFunction(int numPoints){

        for (int i = 0; i < (xMax - xMin); i++) {
            if(i != -xMin) {
                canvas.drawLine(xConversion * i, (int)(yConversion*-yMin) - 10, xConversion * i, (int)(yConversion*-yMin) + 10);
            } else{
                canvas.drawLine(xConversion * i, 0, xConversion * i, height);
            }
        }

    }
    */
    
}