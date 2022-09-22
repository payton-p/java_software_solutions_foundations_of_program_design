package helper_notes;

public class VariableLengthParameterListTester {
  // The ellipsis indicates that the method accepts a variable number of parameters.
  private static void fun(int... integers) {
    System.out.println("Number of arguments: " + integers.length);

    for (int i : integers)
      System.out.print(i + "\n");
  }

  // A method that accepts a variable number of parameters can also accept other parameters. The
  // varying parameters must come last in the formal arguments. A single method cannot accept two
  // sets of varying parameters.
  private static void fun2(String str, int... a) {
    System.out.println("String: " + str);
    System.out.println("Number of arguments: " + a.length);

    for (int i : a)
      System.out.print(i + "\n");
  }

  public static void main(String args[]) {
    // Calling the method with different numbers of parameters

    fun(100); // one parameter
    fun(1, 2, 3, 4); // four parameters
    fun(); // no parameter

    System.out.println();
    fun2("Hello", 1, 2, 3);
  }
}
