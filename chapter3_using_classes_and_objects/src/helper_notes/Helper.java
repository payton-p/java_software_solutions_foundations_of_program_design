package helper_notes;

import java.util.Random;
import java.util.Scanner;

public class Helper {
  public static void main(String[] args) {
    // Strings are immutable in Java
    String exampleStr = "I am immutable!";
    String newStr = exampleStr.concat(" More string.\n"); // Creates a new string object
    System.out.println(newStr);

    // Object reference variables return the address of the object, this can be thought of as a
    // pointer to the location in memory where the object is held
    Scanner scan = new Scanner(System.in);
    scan.close();

    // Primitive variables return the actual value of the primitive
    int num = 0;

    // The Random class represents a pseudorandom number generator
    Random randomGenerator = new Random();
    System.out.println("Random int between 0 and 9: " + randomGenerator.nextInt(10) + "\n");

    // All methods in Math class are static methods (aka class methods), meaning they are invoked
    // through the class name
    double numSquared = Math.pow(num, 2);
    System.out.println(numSquared + "\n");
  }
}
