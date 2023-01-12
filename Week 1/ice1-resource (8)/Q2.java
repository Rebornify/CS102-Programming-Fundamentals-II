import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word:");
        String first = sc.nextLine();

        System.out.print("Enter first word:");
        String second = sc.nextLine();

        while (first.charAt(0) != second.charAt(0)) {
            System.out.println("try again");

            System.out.print("Enter first word:");
            first = sc.nextLine();

            System.out.print("Enter first word:");
            second = sc.nextLine();
        }

        System.out.println("Bingo");
    }
}