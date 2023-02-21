import java.util.*;
import java.io.*;

public class InventoryApp {
    public static void stockTaking(String fileNameAndPath) {
        try (Scanner file = new Scanner(new File(fileNameAndPath))) {
            file.useDelimiter(",|\r\n|\n");
            while (file.hasNext()) {
                System.out.println(String.format("There are %d %s, each cost $%.2f", file.nextInt(),
                        file.next(), file.nextFloat()));
            }
        } catch (FileNotFoundException e) {
            
        }
    }

    public static void main(String[] args) {
        stockTaking("product.csv");
    }
}
