import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Enter details of the first person:");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        Person p1 = new Person(firstName, lastName, age);
        System.out.println(p1.toString());
        System.out.println();

        System.out.println("Enter details of the second person:");

        System.out.print("Enter first name : ");
        firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        lastName = sc.nextLine();

        Person p2 = new Person(firstName, lastName);
        System.out.println(p2.toString());
        System.out.println();

        System.out.print("Enter age of second person : ");
        age = sc.nextInt();
        System.out.println();

        p2.setAge(age);
        System.out.println(p2.toString());
    }
}