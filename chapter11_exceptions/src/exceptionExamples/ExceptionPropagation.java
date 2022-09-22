package exceptionExamples;

// An exception is first thrown from the top of the stack and if it is not caught, it drops down the
// call stack to the previous method.
public class ExceptionPropagation {
  private void m() {
    int data = 50 / 0; // unchecked exception occurred, exception propagated to n()
    System.out.println(data); // this won't get called
  }

  private void n() {
    m(); // exception propagated to p()
  }

  private void p() {
    try {
      n(); // exception handled
    } catch (Exception e) {
      System.out.println("Exception handled in p()'s try block. Exception: " + e.getMessage());
    }
  }

  public static void main(String args[]) {
    ExceptionPropagation obj = new ExceptionPropagation();
    obj.p();
    System.out.println("Back to normal flow...");
  }
}
