import java.util.Scanner;
import java.io.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter filename> ");
            String fileName = sc.nextLine();

            try (Scanner file = new Scanner(new File(fileName))) {
                isValid = true;
                file.useDelimiter(",|\r\n|\n");
                while (file.hasNext()) {
                    System.out.println(file.nextInt() + file.nextInt() + file.nextInt());
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " is invalid");
            }
        }
    }
}
