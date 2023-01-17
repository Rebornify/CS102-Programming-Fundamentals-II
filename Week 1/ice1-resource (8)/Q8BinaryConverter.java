import java.util.Scanner;

public class Q8BinaryConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter decimal number:");
    int decimal = sc.nextInt();

    System.out.print("Binary equivalent of " + decimal + " is ");

    int binary[] = new int[32];
    int index = 0;

    while (decimal > 0) {
      binary[index++] = decimal % 2;
      decimal /= 2;
    }

    for (int i = index - 1; i >= 0; i--) {
      System.out.print(binary[i]);
    }

    System.out.println();
  }
}