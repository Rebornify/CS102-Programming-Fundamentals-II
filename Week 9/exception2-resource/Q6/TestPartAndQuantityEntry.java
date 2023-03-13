import java.util.*;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter part number> ");
            int partNumber = sc.nextInt();
            System.out.println();
    
            System.out.print("Enter quantity> ");
            int orderQuantity = sc.nextInt();
    
            PartAndQuantityEntry entry = new PartAndQuantityEntry();
            try {
                entry.enterPartAndQuantity(partNumber, orderQuantity);
                isValid = true;
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }

    }
}
