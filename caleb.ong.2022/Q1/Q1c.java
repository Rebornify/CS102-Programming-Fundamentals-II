/*
 * Name:Caleb Ong Ye Sheng
 * Email ID: caleb.ong.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q1c {
    /*
     * Write the method getMostCommonVowel
     */
    public static ArrayList<Character> getMostCommonVowel(ArrayList<String> inputs) {
        ArrayList<Character> result = new ArrayList<>();

        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        int count_5 = 0;

        for (String s : inputs) {
            String lower = s.toLowerCase();
            for (int i = 0; i < lower.length(); i++) {
                char letter = lower.charAt(i);

                switch (letter) {
                    case 'a':
                        count_1++;
                        break;
                    case 'e':
                        count_2++;
                        break;
                    case 'i':
                        count_3++;
                        break;
                    case 'o':
                        count_4++;
                        break;
                    case 'u':
                        count_5++;
                        break;
                }
            }
        }

        System.out.printf("%d", count_2);

        if (count_1 > count_2 && count_1 > count_3 && count_1 > count_4 && count_1 > count_5) {
            result.add('a');
        }

        if (count_2 > count_1 && count_2 > count_3 && count_2 > count_4 && count_2 > count_5) {
            result.add('e');
        }

        if (count_3 > count_2 && count_3 > count_1 && count_3 > count_4 && count_3 > count_5) {
            result.add('i');
        }

        if (count_4 > count_2 && count_4 > count_3 && count_4 > count_1 && count_4 > count_5) {
            result.add('o');
        }

        if (count_5 > count_2 && count_5 > count_3 && count_5 > count_4 && count_5 > count_1) {
            result.add('u');
        }

        return result;
    }

    public static void main(String[] args) {
    
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("Abate", "Facet", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("ace", "ANT", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("pygmy", "crypt", "lymph", "psych"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }
}