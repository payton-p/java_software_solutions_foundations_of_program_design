package exceptionExamples;

public class TryCatchTester {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("This is in the catch clause. Something went wrong. Stack trace:");
      e.printStackTrace();
    } finally { // this is always executed
      System.out.println("\nThis is in the finally clause. The 'try catch' is finished.");
    }
  }
}
