import java.util.*;
import java.io.*;

public class Q7 {
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
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] numbers = line.split(",");

                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.print(numbers[i]);
                    if (i > 0) {
                        System.out.print(",");
                    }
                }

                System.out.println();
            }
        }
    }
}
