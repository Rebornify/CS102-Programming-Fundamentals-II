import java.io.*;

public class TextFileReader {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String fileNameAndPath = "data/students.txt";
        File f = new File(fileNameAndPath);
        if (f.exists()) {
            System.out.println("Yes, " + fileNameAndPath + " exists");
        } else {
            System.out.println("No, " + fileNameAndPath + " does not exist");
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
