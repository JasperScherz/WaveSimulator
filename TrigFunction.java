import java.util.concurrent.TimeUnit;
public class TrigFunction extends Function{


    public TrigFunction(NPTS functionName, int numOfCoefficients, SimpleCanvas canvas){
        super(functionName.getCoefficients(numOfCoefficients), 0, canvas);
        //this.functionName = functionName;
    }

    public double evaluateFunction(double x){
        double convertedX = (x) % (2 * PI);
        
        if(convertedX < PI){
            convertedX += 2 * PI;
        }

        if(convertedX > PI){
            convertedX -= 2 * PI;
        }
        double value = super.evaluateFunction(convertedX);
        return value;
    }

    public void animateFunction(int numPoints, int time){
        canvas.show();
        double counter = 0;
        int timeCounter = 0;
        while(timeCounter < time){
            canvas.clear();

             //Draws xAxis
            for (int i = 0; i < (xMax - xMin); i++) {
                if(i != -xMin) {
                    canvas.drawLine(xConversion * i, (int)(yConversion*-yMin) - 10, xConversion * i, (int)(yConversion*-yMin) + 10);
                } else{
                    canvas.drawLine(xConversion * i, 0, xConversion * i, height);
                }
            }

            //Draws yAxis
            for (int i = 0; i < (yMax - yMin); i++) {
                if(i != -yMin) {
                    canvas.drawLine((int)(xConversion*-xMin) - 10, yConversion * i, (int)(xConversion*-xMin) + 10, yConversion * i);
                } else{
                    canvas.drawLine(0, yConversion * i, width, yConversion * i);
                }
            } 


            for(double i = numPoints * (xMin - 20) ; i < numPoints*(xMax+1); i++){
                double x = i/numPoints;

                canvas.drawFilledCircle(xCoord(x) + (int)(counter * xConversion), yCoord(x), 5);
            }
            
            canvas.update();

            if (counter >= 2 * PI){
                counter = 0;
            }

            counter += 0.1;
            try {
                Thread.sleep(125);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }
    }

    public void printPi(){
        System.out.println(PI);
    }
}