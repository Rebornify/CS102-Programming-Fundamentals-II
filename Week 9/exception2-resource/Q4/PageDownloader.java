import java.net.*;
import java.util.Scanner;
import java.io.*;

public class PageDownloader {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the URL> ");
            String websiteURL = console.nextLine();

            try (Scanner sc = new Scanner(new URL(websiteURL).openStream())) {
                while (sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }

                return;
            } catch (MalformedURLException e) {
                System.out.println("Invalid URL!");
            } catch (IOException e) {
                System.out.println("Invalid URL!");
            }

            System.out.println();
        }
    }
}
