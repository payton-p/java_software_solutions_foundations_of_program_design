package chapter12_recursion;

public class RecursionTester {
  public static void main(String[] args) {
    // Sum of n natural numbers
    System.out.println("The sum of the values from 1 to 3 = " + SumNaturalNumbers.sum(3));

    // Solve maze
    Maze labyrinth = new Maze();
    System.out.println("\nHere is the maze:\n" + labyrinth);

    if (labyrinth.traverse(0, 0)) {
      System.out.println("The maze was successfully traversed! Here is the path:");
    } else {
      System.out.println("There is no possible path.");
    }

    System.out.println(labyrinth);

    // Solve Towers of Hanoi puzzle
    TowersOfHanoi towers = new TowersOfHanoi(4);
    towers.solve();
  }
}
