/*
 * Name:Caleb Ong Ye Sheng
 * Email ID: caleb.ong.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q2c {
    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {
        List<School> schools = new ArrayList<>(List.of(
            new School(1),
            new School(2),
            new School(3)));

        /*
         * *******************************************************************
         * The following code tests the method getStudentsWithSiblingsInSameSch.
         */
        System.out.println("Expected:5");
        System.out.println("Actual  :" + getStudentsWithSiblingsInSameSch(schools));
    
    }

    /*
     * Write the method getStudentsWithSiblingsInSameSch
     */
    public static int getStudentsWithSiblingsInSameSch(List<School> schools) {
        int count = 0;
        for (School sch : schools) {
            List<Student> listOfStudents = sch.getStudents();
            for (Student s1 : listOfStudents) {
                for (Student s2 : listOfStudents) {
                    if (s1.getParent().equals(s2.getParent()) && !s1.equals(s2)) {
                        count++;
                    }
                }
            }
        }

       return count / 2;
    }
}
