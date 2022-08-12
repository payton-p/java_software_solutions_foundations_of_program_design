package scanner_examples;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    // Takes input from the keyboard - System.in represents a standard input stream, which be
    // default is the keyboard
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a line of text:");

    String message = scan.nextLine();

    System.out.println("You entered: \n" + message);

    scan.close();
  }
}
