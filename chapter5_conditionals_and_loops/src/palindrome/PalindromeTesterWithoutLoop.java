package palindrome;

import java.util.Scanner;

public class PalindromeTesterWithoutLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string to test if it's a palindrome:");
    String str = scan.nextLine();

    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append(str);
    String reverseStr = strBuilder.reverse().toString();

    if (str.equals(reverseStr)) {
      System.out.println("That string is a palindrome.\n");
    } else {
      System.out.println("That string is NOT a palindrome.\n");
    }

    scan.close();
  }
}
