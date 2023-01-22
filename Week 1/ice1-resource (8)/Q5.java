import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(((char) ('a' + (i % 26)) + " "));
        }

        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.print(1 + i);
            System.out.print(2 + i);
            System.out.print(3 + i + " ");
        }

        System.out.println();

        int j = 1;
        for (int i = 1; i <= num;) {
            if (j < i) {
                System.out.printf("%d", j++);
            } else {
                System.out.printf("%d\n", i++);
                j = 1;
            }
        }
    }
}