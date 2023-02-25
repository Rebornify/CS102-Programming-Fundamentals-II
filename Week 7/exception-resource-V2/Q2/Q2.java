import java.util.Scanner;
import java.io.*;

public class Q2 {
    public static Scanner getScanner() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter filename> ");
            String fileName = sc.nextLine();

            try {
                return new Scanner(new File(fileName));
            } catch (FileNotFoundException e) {
                System.out.println(fileName + " is invalid");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = getScanner()) {
            int sum = 0;

            while (sc.hasNext()) {
                sum += sc.nextInt();
            }

            System.out.println("The sum is " + sum);
        }
    }
}
