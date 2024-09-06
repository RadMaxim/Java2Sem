package ExceptionMethod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arrayK = SearchK.getK("x2+6x+8");
        System.out.println(Arrays.toString(arrayK));
        double[] res = HardExpression.getX(arrayK);
        System.out.println(Arrays.toString(res));
//        double x = 0;
//        double y = Math.pow(x,2)+6*x+8;
//        double d = Math.pow(6,2)-4*1*8;
//        double x1 = (-6+Math.pow(d,0.5))/2;
//        double x2 = (-6-Math.pow(d,0.5))/2;
//        System.out.println(x1);
//        System.out.println(x2);

    }

}
