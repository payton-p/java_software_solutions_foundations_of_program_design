package method_overloading;

public class MethodOverloading {
  // In Java, two or more methods may have the same name if they differ in parameters (different
  // number of parameters, different types of parameters, or both). These methods are called
  // overloaded methods and this feature is called method overloading.

  private static void display(int a) {
    System.out.println("Arguments: " + a);
  }

  private static void display(int a, int b) {
    System.out.println("Arguments: " + a + " and " + b);
  }

  public static void main(String[] args) {
    display(1);
    display(1, 4);
  }
}
