public class WaveSim {

    public static void main(String[] args) {

        SimpleCanvas canvas = new SimpleCanvas(1920,1080);

    }

    public static void testFunction(SimpleCanvas canvas){
        float[] f1Coef = {1,1/5f,1,1};
        Function f1 = new Function(f1Coef,-1, canvas);
        float[] f2Coef = {1/5f, 1, 1, 1};
        Function f2 = new Function(f2Coef,-1, canvas);
        float[] f3Coef = {1,1,1/5f,1};
        Function f3 = new Function(f3Coef,-1, canvas);
        float[] f4Coef = {1,1,1,1/5f};
        Function f4 = new Function(f4Coef,-1, canvas);

        f1.setWindow(-20, 20, -20, 20);
        f1.plotFunction(200);
        f2.plotFunction(200);
        f3.plotFunction(200);
        f4.plotFunction(200);
    }

    public static void testRationalFunction(SimpleCanvas canvas){
        float[] numCoefficients = {4, 0 , 1}; //x^2 + 4  at 3 = 9 + 4 = 13 13/4 = 3.25
        float[] denomCoefficients = {1, 1};   //x + 1    at 3 = 3 + 1 = 4
        RationalFunction f1RationalFunction = new RationalFunction(numCoefficients, denomCoefficients, 0, 0, canvas);
        //f1RationalFunction.printFunction();
        f1RationalFunction.setWindow(-20, 20, -20, 20);
        f1RationalFunction.plotFunction(200);
    }
}
