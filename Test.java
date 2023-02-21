import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("abc.txt"))) {
            sc.useDelimiter(",|\r\n|\n");
            while (sc.hasNext()) {
                System.out.println(sc.next() + sc.nextInt());
            }
        } catch (FileNotFoundException e){
            System.out.println("invalid file");
        }
    }
}