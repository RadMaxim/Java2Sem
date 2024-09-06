package CreateClass.MethodsCheckData;

import java.util.Scanner;

public class CheckNames {
    static Scanner scanner = new Scanner(System.in);
    public static String checkName(String nameShip) {
        while (true){
            if (nameShip.length()<3){
                System.out.println("<3");
            } else if (!nameShip.replaceAll("[a-zA-Z]", "").isEmpty()) {
                System.out.println("Symbol");
            } else if (nameShip.toUpperCase().charAt(0)!=nameShip.charAt(0)) {
                System.out.println("First symbol ");
            }
            else {
               return nameShip;

            }
                System.out.println("Enter again: ");
                nameShip = scanner.nextLine();

        }
        
    }
}
