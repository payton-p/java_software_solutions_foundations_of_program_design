package helper_notes;

public class TwoDimensionalArrayTester {
  // Brackets are used to represent each dimension in the array. therefore the type of a 2-D array
  // that stores integers is int[][]. Technically, Java represents 2-D arrays as an array of arrays.
  // A 2-D integer array is really a one-dimensional array of references to one-dimensional integer
  // arrays. Using an array with more than two dimensions is rare in an object-oriented system.
  public static void main(String[] args) {
    int[][] table = new int[5][10];

    // Set the table's values
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        table[row][col] = row * 10 + col;
      }
    }

    // Print the table
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print(table[row][col] + "\t");
      }

      System.out.println();
    }
  }
}
