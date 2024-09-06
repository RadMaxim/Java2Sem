package WriteFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <10; i++) {
            stringBuilder.append("line:").append(i).append("\n");
        }
        System.out.println(stringBuilder);
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.append(stringBuilder);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Mistake");
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader("test.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
