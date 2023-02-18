/*
 * Name:Caleb Ong Ye Sheng
 * Email ID: caleb.ong.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q2b {
    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {
        List<School> schools = new ArrayList<>(List.of(
            new School(1),
            new School(2),
            new School(3)));
        
        int tcNum = 1;
        int year = 2024;
        String level = "P2";
        List<Student> answer = getStudents(schools, year, level);
        System.out.printf("Test %s: getStudents%n", tcNum++);
        System.out.println("Expected:[(Kelly, P2, 1/1/2024, Jason), (Zoe, P2, 1/1/2024, Jason)]");
        System.out.println("Actual  :" + answer);
        System.out.println();

        System.out.printf("Test %s: getStudents%n", tcNum++);
        List<Student> answer2 = getStudents(schools, 2023, null);
        System.out.println("Expected:[(Mary, P2, 1/1/2023, Betty), (Lionel, P2, 1/1/2023, David), (Sandy, P1, 1/1/2023, Betty), (Charlie, P2, 1/1/2023, Tony)]");
        System.out.println("Actual  :" + answer2);
        System.out.println();
        System.out.println();

    }

    /*
     * Write the method getStudents
     */
    public static ArrayList<Student> getStudents(List<School> schools, int yearJoined,
            String level) {
        ArrayList<Student> result = new ArrayList<>();

        for (School sch : schools) {
            List<Student> listOfStudents = sch.getStudents();
            for (Student s : listOfStudents) {
                String date = s.getDateJoined();
                date = date.substring(4);

                if (level == null) {
                    if (date.equals(yearJoined + "")) {
                        result.add(s);
                    }
                } else if (s.getLevel().equals(level) && date.equals(yearJoined + "")) {
                    result.add(s);
                }
            }
        }

        return result;
    }

}
