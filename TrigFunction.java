public class TrigFunction extends Function{

    

    public TrigFunction(MathFunction functionName, int numOfCoefficients, SimpleCanvas canvas){
        super(coefficients, 1, canvas);
        switch (MathFunction.size){
            case 1: functionName = MathFunction.SIN;
                float[] coefficients = new float[numOfCoefficients];
                int index = 1;
                float sign = 1F;
                for (float coefficient : coefficients) {
                    coefficient = sign / factorial(index);
                    sign *= -1;
                    index += 2;
                }
                

        }
    }

    public float[] getCoefficients(int numOfCoefficients){
        float[] coefficients = new float[numOfCoefficients];
        int index = 1;
        float sign = 1F;
        for (float coefficient : coefficients) {
            coefficient = sign / factorial(index);
            sign *= -1;
            index += 2;
        }
        return coefficients;
    }

    private static int factorial(int x){
        if(x == 1 || x == 0){
            return 1;
        } else{
            return x * factorial(x - 1);
        }
    }
}