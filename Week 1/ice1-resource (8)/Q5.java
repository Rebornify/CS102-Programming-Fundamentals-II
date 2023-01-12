import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print((char)('a' + (i % 26)) + " ");
        }
    }
}