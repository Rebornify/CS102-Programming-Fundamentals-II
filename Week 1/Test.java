import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n:");
            String value = sc.nextLine();
            System.out.println("the value is " + value);
        }
    }
}