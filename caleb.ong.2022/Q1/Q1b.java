/*
 * Name:Caleb Ong Ye Sheng
 * Email ID:caleb.ong.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1b {

    /*
     * Write the method getLongestPalindromeWord
     */
    public static String getLongestPalindromeWord(ArrayList<String> inputs) {
        String longest = "";
        for (String s : inputs) {
            String lower = s.toLowerCase();
            String rev = "";

            for (int i = s.length() - 1; i >= 0 ; i--) {
                rev += lower.charAt(i);
            }

            if (lower.equals(rev) && s.length() > longest.length()) {
                longest = s;
            }
        }

        if (longest.length() == 0) {
            return null;
        }

        return longest;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("Madam");
            inputs.add("wow");
            inputs.add("success");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : Madam");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("apple");
            inputs.add("orange");
            inputs.add("pear");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : kayak");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("abcd");
            inputs.add("cdedc");
            inputs.add("abgba");
            inputs.add("cddc");
            inputs.add("cddca");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : cdedc");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("ab");
            inputs.add("abc");
            inputs.add("abccab");
            inputs.add("abab");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : null");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
    }
}