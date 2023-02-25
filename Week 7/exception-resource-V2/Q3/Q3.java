import java.util.Scanner;
import java.io.*;

public class Q3 {
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
            sc.useDelimiter(",|\r\n|\n");
            while (sc.hasNext()) {
                System.out.println(sc.nextInt() + sc.nextInt() + sc.nextInt());
            }
        }
    }
}
