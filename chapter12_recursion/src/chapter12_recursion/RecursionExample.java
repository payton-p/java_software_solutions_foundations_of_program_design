package chapter12_recursion;

public class RecursionExample {
  // The sum of the values from 1 to n, which can be expressed as n plus the sum of the values from
  // 1 to n - 1.
  private static int sum(int n) {
    int result;
    if (n == 1) { // base case
      result = 1;
    } else {
      result = n + sum(n - 1);
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(sum(3));
  }
}
