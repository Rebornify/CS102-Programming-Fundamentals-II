import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the first item: $");
        double firstItem = sc.nextDouble();
        cashRegister.registerPurchase(firstItem);

        System.out.print("Enter the price of the second item: $");
        double secondItem = sc.nextDouble();
        cashRegister.registerPurchase(secondItem);
        System.out.println();

        System.out.print("Enter dollars received from customer: ");
        int dollars = sc.nextInt();

        System.out.print("Enter cents received from customer: ");
        int cents = sc.nextInt();

        cashRegister.makePayment(dollars, cents);
        System.out.println();

        System.out.println("Total cost of purchase: $" + (cashRegister.getPurchaseAmt() / 100));
        System.out.println("Change due: $" + (cashRegister.giveChange() / 100));
    }
}