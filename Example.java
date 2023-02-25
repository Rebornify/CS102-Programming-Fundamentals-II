import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Example {
    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(new FileOutputStream("fruits.txt", false))) {
            out.println("testing");
            out.println(1);
            out.print("apple");
            out.println(12);
        } catch (FileNotFoundException e) {

        }
    }
}
