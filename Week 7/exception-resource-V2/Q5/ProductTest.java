import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    try (PrintStream out = new PrintStream(new FileOutputStream(pathAndFileName, true))) {
      for (Product product : productList) {
        out.println(product.getName() + "," + product.getQuantity() + "," + product.getPrice());
      }
    } catch (FileNotFoundException e) {
      System.out.println(pathAndFileName + " is invalid");
    }
  }
}
