package chapter12_recursion;

public class Maze {
  private final int TRIED = 3;
  private final int PATH = 7;

  private int[][] grid =
      {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
          {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
          {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1}, {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
          {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

  public boolean traverse(int row, int column) {
    boolean done = false;

    if (valid(row, column)) {
      grid[row][column] = TRIED; // this cell has been tried/attempted

      if (row == grid.length - 1 && column == grid[0].length - 1) {
        done = true; // the maze is solved
      } else {
        done = traverse(row + 1, column); // down

        if (!done) {
          done = traverse(row, column + 1); // right
        }
        if (!done) {
          done = traverse(row - 1, column); // up
        }
        if (!done) {
          done = traverse(row, column - 1); // left
        }
      }

      if (done) {
        grid[row][column] = PATH; // this location is part of the final path
      }
    }

    return done;
  }

  private boolean valid(int row, int column) {
    boolean result = false;

    // Check if the cell is in the bounds of the matrix
    if (row >= 0 && row < grid.length && column >= 0 && column < grid[row].length) {
      // Check if the cell is not blocked and not previously tried
      if (grid[row][column] == 1) {
        result = true;
      }
    }

    return result;
  }

  public String toString() {
    String result = "";

    for (int row = 0; row < grid.length; row++) {
      for (int column = 0; column < grid[row].length; column++) {
        result += grid[row][column] + "";
      }

      result += "\n";
    }

    return result;
  }
}
