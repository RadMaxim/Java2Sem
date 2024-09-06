package ExceptionMethod;

import java.util.Arrays;

public class SearchK {
    public static double[] getK(String test){

       String[] arrayK = test.split("[+-]");
        System.out.println(Arrays.toString(arrayK));
        System.out.println(arrayK[0].substring(0,arrayK[0].indexOf("x2")));
       double a = Double.parseDouble(arrayK[0].substring(0,arrayK[0].indexOf("x2")).isEmpty()?"1":arrayK[0].substring(0,arrayK[0].indexOf("x2")));
       double b = Double.parseDouble(arrayK[1].substring(0,arrayK[1].indexOf("x")).isEmpty()?"1":arrayK[1].substring(0,arrayK[1].indexOf("x")));
       double c = Double.parseDouble(arrayK[2].isEmpty()?"0":arrayK[2]);

        return new double[]{a,b,c};
    }
}
