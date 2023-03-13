import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = promptForNumber(sc, "Enter num1> ");
        int num2 = promptForNumber(sc, "Enter num2> ");
    
        int sum = num1 + num2;

        System.out.println("The answer is " + sum);
    }

    private static int promptForNumber(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.nextLine();
            } finally {
                System.out.println();
            }
        }
    }
}