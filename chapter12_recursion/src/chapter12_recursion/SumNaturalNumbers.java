package chapter12_recursion;

public class SumNaturalNumbers {
  // The sum of the values from 1 to n, which can be expressed as n plus the sum of the values from
  // 1 to n - 1.
  public static int sum(int n) {
    int result;
    if (n == 1) { // base case
      result = 1;
    } else {
      result = n + sum(n - 1);
    }

    return result;
  }
}
