public class PartAndQuantityEntry {
    public void enterPartAndQuantity(int partNumber, int quantityOrdered) {
        if (partNumber < 0 || partNumber > 999 || quantityOrdered < 1 || quantityOrdered > 5000) {
            throw new IllegalArgumentException("Invalid order, part number should be between 0 and 999, quanity ordered between 1 and 5000");
        } else {
            System.out.println("successfully inserted order");
        }
    }
}
