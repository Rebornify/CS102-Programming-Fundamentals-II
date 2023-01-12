import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        boolean isValid = false;

        int product = -1;
        String result = "";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number:");
            int num = sc.nextInt();

            if (num < 0) {
                isValid = true;

                if (product == -1) {
                    System.out.println("No positive number is entered");
                } else {
                    System.out.println(result + " = " + product);
                }
            }

            if (product == -1) {
                product *= num * -1;
                result += num;
            } else {
                product *= num;
                result  += " x " + num;
            }
        } while (!isValid);
    }
}