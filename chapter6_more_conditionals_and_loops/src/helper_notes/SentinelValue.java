package helper_notes;

import java.util.Scanner;

public class SentinelValue {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // A “sentinel” is a specific value used to terminate a condition in a recursive or looping
    // algorithm
    String sentinelValue = "quit";
    String message = "";
    while (!message.toLowerCase().equals(sentinelValue)) {
      System.out.println("Enter a line of text:");
      message = scan.nextLine();

      System.out.println("You entered: " + message + "\n");
    }

    System.out.println("The sentinel value has been entered. The end.");

    scan.close();
  }
}
