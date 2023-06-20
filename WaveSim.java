public class WaveSim {

    public static void main(String[] args) {

        SimpleCanvas canvas = new SimpleCanvas(1920,1080);

        testTrigFunction(canvas);

    }

    public static void testTrigFunction(SimpleCanvas canvas){
        NPTS sin = NPTS.SIN;
        TrigFunction f1TrigFunction = new TrigFunction(sin, 9, canvas);
        f1TrigFunction.printFunction();
        f1TrigFunction.setWindow(-20.0, 20.0, -20.0, 20.0);
        f1TrigFunction.plotFunction(100);
        System.out.println("\n" + f1TrigFunction.evaluateFunction(6));
    }


    public static void testRationalFunction(SimpleCanvas canvas){
        double[] numCoefficients = {4.0, 0.0 , 1.0}; //x^2 + 4  at 3 = 9 + 4 = 13 13/4 = 3.25
        Function numFunction = new Function(numCoefficients, 0, canvas);
        double[] denomCoefficients = {1.0, 1.0};   //x + 1    at 3 = 3 + 1 = 4
        Function denomFunction = new Function(denomCoefficients, 0, canvas);
        RationalFunction f1RationalFunction = new RationalFunction(numFunction, denomFunction, canvas);
        f1RationalFunction.printFunction();
        f1RationalFunction.setWindow(-20.0, 20.0, -20.0, 20.0);
        f1RationalFunction.plotFunction(200);
    }

    public static void testFunction(SimpleCanvas canvas){
        double[] f1Coef = {1.0,1/5.0,1.0,1.0};
        Function f1 = new Function(f1Coef,-1, canvas);
        double[] f2Coef = {1/5.0, 1.0, 1.0, 1.0};
        Function f2 = new Function(f2Coef,-1, canvas);
        double[] f3Coef = {1.0,1.0,1/5.0,1.0};
        Function f3 = new Function(f3Coef,-1, canvas);
        double[] f4Coef = {1.0,1.0,1.0,1/5.0};
        Function f4 = new Function(f4Coef,-1, canvas);

        f1.setWindow(-20.0, 20.0, -20.0, 20.0);
        f1.plotFunction(200);
        f2.plotFunction(200);
        f3.plotFunction(200);
        f4.plotFunction(200);
    }
}
