package ExceptionMethod;

public class HardExpression {
    public static double[] getX(double[] arr) {
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double d = Math.pow(b,2)-4*a*c;
        double x1 = (-b+Math.pow(d,0.5))/2;
        double x2 = (-b-Math.pow(d,0.5))/2;
        return new double[]{x1,x2};
    }
}
