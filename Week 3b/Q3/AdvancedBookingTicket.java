public class AdvancedBookingTicket extends Ticket{
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double originalPrice = super.calculatePrice();
        double discounted = originalPrice - 0.5 * numDaysInAdvance;

        return Math.max(0.5 * originalPrice, discounted);
    }
}
