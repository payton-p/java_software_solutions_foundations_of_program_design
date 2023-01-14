package helper_notes;

public class FloatComparisonTester {
  public static void main(String[] args) {
    double a = 1.398447484;
    double b = 1.398447482;

    // This allows us to specify how precise the comparison needs to be
    double precisionLimit = 1e-9;

    // This is an example of how a conditional operator is used
    String message = Math.abs(a - b) < precisionLimit ? "are" : "are not";

    System.out.println("The numbers " + message + " equal.");
  }
}
