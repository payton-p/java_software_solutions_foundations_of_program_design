package palindrome;

import java.util.Scanner;

public class PalindromeTesterWithLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String continueTesting = "y";
    while (continueTesting.equalsIgnoreCase("y")) {
      System.out.println("\nEnter a string to test if it's a palindrome:");
      String str = scan.nextLine();

      int left = 0;
      int right = str.length() - 1;
      while (str.charAt(left) == str.charAt(right) && left < right) {
        left++;
        right--;
      }

      if (left < right) {
        System.out.println("That string is NOT a palindrome.\n");
      } else {
        System.out.println("That string is a palindrome.\n");
      }

      System.out.println("Test another string (y/n)?");
      continueTesting = scan.nextLine();
    }

    System.out.println("\nThe palindrome test has been terminated.");

    scan.close();
  }
}
