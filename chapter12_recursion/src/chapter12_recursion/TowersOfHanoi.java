package chapter12_recursion;

public class TowersOfHanoi {
  private int numDisks;

  public TowersOfHanoi(int numDisks) {
    this.numDisks = numDisks;
  }

  public void solve() {
    moveTower(numDisks, 1, 3, 2);
  }

  // This is a short and elegant solution, but it is very inefficient. To solve a the puzzle with a
  // stack of n disks, it takes 2^n - 1 individual disk moves.
  private void moveTower(int numDisks, int start, int end, int temp) {
    if (numDisks == 1) {
      moveOneDisk(start, end);
    } else {
      moveTower(numDisks - 1, start, temp, end);
      moveOneDisk(start, end);
      moveTower(numDisks - 1, temp, end, start);
    }
  }

  private void moveOneDisk(int start, int end) {
    System.out.println("Move one disk from " + start + " to " + end);
  }
}
