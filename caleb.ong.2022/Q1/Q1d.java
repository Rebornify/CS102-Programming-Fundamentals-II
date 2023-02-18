/*
 * Name:Caleb Ong Ye Sheng
 * Email ID: caleb.ong.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1d {
    /*
     * Write the method getIncreasingCharWords
     */
    public static ArrayList<String> getIncreasingCharWords(ArrayList<String> inputs) {
        ArrayList<String> result = new ArrayList<>();

        for (String s : inputs) {
            if (s.length() == 1) {
                result.add(s);
                continue;
            }

            String lower = s.toLowerCase();

            for (int i = 0; i < lower.length() - 1; i++) {
                if (lower.charAt(i) > lower.charAt(i + 1) ) {
                    break;
                } else if (i == lower.length() - 2) {
                    result.add(s);
                }
            }
        }

        return result;
        // to make this code compile. Please modify accordingly!

    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("access", "AcT", "big", "bUy", "bird"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [access, AcT, bUy]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("a", "dc", "ab"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, ab]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("Ailment", "crate", "raid"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }

}