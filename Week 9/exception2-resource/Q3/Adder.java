import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        while (num1 == Integer.MIN_VALUE || num2 == Integer.MIN_VALUE) {
            try {
                if (num1 == Integer.MIN_VALUE) {
                    System.out.print("Enter num 1> ");
                    num1 = sc.nextInt();
                } else {
                    System.out.print("Enter num 2> ");
                    num2 = sc.nextInt();
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                sc.nextLine();
            }

            System.out.println();
        }
    
        int sum = num1 + num2;

        System.out.println("The answer is " + sum);
    }
}