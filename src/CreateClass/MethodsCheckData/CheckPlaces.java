package CreateClass.MethodsCheckData;

import java.util.Scanner;

public class CheckPlaces {
    static Scanner scanner  = new Scanner(System.in);
    public static int checkPlaces(int places){
        while (places<=0){
            System.out.println("Smt");
            places = scanner.nextInt();

        }
        return places;
    }
}
