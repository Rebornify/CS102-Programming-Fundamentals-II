import java.util.*;
public class CompanyTest {
    public static void checkEmployee(Company comp, int id) {
        Employee employee = comp.getEmployee(id);
        Spouse spouse = employee.getSpouse();

        System.out.printf("Name: %s, Salary: %.2f, Status: %s\n",
                employee.getName(), employee.getSalary(),
                spouse == null ? "Single" : "Married");

        if (spouse != null) {
            System.out.printf("Spouse's name: %s", spouse.getName());
        }
    }

    public static void main(String[] args) {
        Company company = new Company("UMS");

        Spouse spouse = new Spouse("Kate", 37);
        Employee employee = new Employee("John", 5, 2500, 'M', spouse);
        company.addEmployee(employee);

        System.out.printf("Total salary(before addition): $%.1f\n\n", company.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int tempID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String tempName = sc.nextLine();

        System.out.print("Enter salary: ");
        double tempSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter gender: ");
        char tempGender = sc.next().charAt(0);

        Employee TempEmployee = new Employee(tempName, tempID, tempSalary, tempGender);
        company.addEmployee(TempEmployee);

        System.out.printf("\nTotal salary(after addition): $%.1f\n\n", company.getAllEmployeesSalary());

        checkEmployee(company, 4);
        System.out.printf("\n");
        checkEmployee(company, 5);
    }
}