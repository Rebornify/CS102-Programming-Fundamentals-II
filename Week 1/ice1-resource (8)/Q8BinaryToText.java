import java.util.*;

public class Q8BinaryToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text message:");
        String text = sc.nextLine();

        char arr[] = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            String binary = Integer.toBinaryString(arr[i]);

            while (binary.length() < 8) {
                binary = "0" + binary;
            }

            System.out.print(binary);
        }
    }
}