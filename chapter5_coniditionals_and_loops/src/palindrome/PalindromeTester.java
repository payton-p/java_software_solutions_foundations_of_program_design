package palindrome;

import java.util.Scanner;

public class PalindromeTester {
  public static void main(String[] args) {
    String str;
    String continueTesting = "y";
    Scanner scan = new Scanner(System.in);

    while (continueTesting.equalsIgnoreCase("y")) {
      System.out.println("\nEnter a string to test if it's a palindrome:");
      str = scan.nextLine();

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
