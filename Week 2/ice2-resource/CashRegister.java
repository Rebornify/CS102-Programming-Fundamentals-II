public class CashRegister {
    private int purchase;
    private int payment;

    public void registerPurchase(double amount) {
        purchase += amount * 100;
    }

    public void makePayment(int dollars, int cents) {
        payment += dollars * 100 + cents;
    }

    public double getPurchaseAmt() {
        return purchase;
    }

    public double giveChange() {
        return payment - purchase;
    }
}
