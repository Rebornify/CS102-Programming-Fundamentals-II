import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1
    // and false otherwise. If there is an alignment, this method
    // also prints out the alignment. See the sample runs of the
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str2.charAt(j) == str1.charAt(i)) {
                System.out.print(str2.charAt(j));
                i++;
                j++;
            } else {
                System.out.print(" ");
                i++;
            }
        }

        System.out.println();

        if (j != str2.length()) {
            return false;
        }

        return true;
    }
}
