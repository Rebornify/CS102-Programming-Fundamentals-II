import java.util.*;

public class Q8TextToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary message:");
        String binary = sc.nextLine();

        for (int i = 0; i < binary.length(); i += 8) {
            char c = (char) Integer.parseInt(binary, i, i + 8, 2);
            System.out.print(c);
        }
    }
}