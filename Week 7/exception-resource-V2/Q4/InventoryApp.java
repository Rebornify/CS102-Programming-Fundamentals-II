import java.util.*;
import java.io.*;

public class InventoryApp {
    public static void stockTaking(String fileNameAndPath) {
        try (Scanner sc = new Scanner(new File(fileNameAndPath))) {
            int totalNumOfProducts = 0;
            float totalCostofProducts = 0;

            sc.useDelimiter(",|\r\n|\n");
            while (sc.hasNext()) {
                int numOfProduct = sc.nextInt();
                String productName = sc.next();
                float productCost = sc.nextFloat();

                System.out.println(String.format("There are %d %s, each cost $%.2f", numOfProduct,
                        productName, productCost));

                totalNumOfProducts += numOfProduct;
                totalCostofProducts += productCost;
            }

            System.out.println(
                    String.format("There are %d products with a total value of $%.2f to be sold.", totalNumOfProducts,
                            totalCostofProducts));

        } catch (FileNotFoundException e) {
            System.out.println(fileNameAndPath + " is invalid");
        }
    }

    public static void main(String[] args) {
        stockTaking("product.csv");
    }
}
