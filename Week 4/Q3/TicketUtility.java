import java.util.*;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        if (ticketList == null || ticketList.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Ticket t : ticketList) {
            sum += t.calculatePrice();
        }

        return sum / ticketList.size();
    }
}