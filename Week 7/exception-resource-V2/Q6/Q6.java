import java.util.Scanner;
import java.io.*;

public class Q6 {
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
                Scanner line = new Scanner(sc.nextLine());
                line.useDelimiter(",|\r\n|\n");

                int sum = 0;

                while(line.hasNext()) {
                    sum += line.nextInt();
                }

                System.out.println(sum);
            }
        }
    }
}
