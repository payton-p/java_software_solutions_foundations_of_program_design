package exceptionExamples;

class InvalidAgeException extends Exception { // custom exception class
  private static final long serialVersionUID = -1167204335921387460L;

  public InvalidAgeException(String str) {
    super(str);
  }
}


public class CustomExceptionTester {
  static void validateAge(int age) throws InvalidAgeException {
    if (age < 18) {

      // Throw an object of user defined exception
      throw new InvalidAgeException("You must be 18 or older to vote.");
    } else {
      System.out.println("Get out and vote!");
    }
  }

  public static void main(String args[]) {
    try {
      validateAge(13);
    } catch (InvalidAgeException e) {
      System.out.println("Example of a custom exception: " + e);
    }
  }
}
