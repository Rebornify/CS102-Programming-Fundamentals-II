import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();

        int product = num;

        String output = "";

        if (product < 0) {
            System.out.println("No positive number is entered");
            return;
        }

        while (num > 0) {
            product *= num;
            output += "x" + num;
            System.out.print("Enter number:");
            num = sc.nextInt();
        }

        System.out.println(output + "=" + product);
    }
}