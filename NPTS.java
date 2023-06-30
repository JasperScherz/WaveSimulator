public enum NPTS{
    //NON-POLYNOMIAL TAYLOR SERIES
    SIN{
        public double[] getCoefficients(int numOfCoefficients){
            double[] coefficients = new double[numOfCoefficients];

            double sign = 1.0;
            for(int i = 1; i < numOfCoefficients; i += 2){
                coefficients[i] = sign / factorial(i);
                sign *= -1;
            }
            return coefficients;
        } 
    },
    COS{
        public double[] getCoefficients(int numOfCoefficients){
            double[] coefficients = new double[numOfCoefficients];
            int index = 1;
            double sign = 1.0;
            for (double coefficient : coefficients) {
                coefficient = sign / factorial(index);
                sign *= -1;
                index += 2;
            }
            return coefficients;
        };
    },
    LN{
        public double[] getCoefficients(int numOfCoefficients){
            double[] coefficients = new double[numOfCoefficients];
            int index = 1;
            double sign = 1.0;
            for (double coefficient : coefficients) {
                coefficient = sign / factorial(index);
                sign *= -1;
                index += 2;
            }
            return coefficients;
        };
    };

    public static final int size;
    static {
        size = values().length;
    }

    public abstract double[] getCoefficients(int numOfCoefficients);

    private static int factorial(int x){
        if(x == 1 || x == 0){
            return 1;
        } else{
            return x * factorial(x - 1);
        }
    }

}