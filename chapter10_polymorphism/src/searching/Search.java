package searching;

public class Search {
  // Sequentially checks each element of the list until a match is found or the whole list has been
  // searched. Average performance: O(n/2).
  public static Comparable<Object> linearSearch(Comparable<Object>[] list,
      Comparable<Object> target) {
    int index = 0;
    boolean found = false;

    while (!found && index < list.length) {
      if (list[index].compareTo(target) == 0) {
        found = true;
      } else {
        index++;
      }
    }

    if (found) {
      return list[index];
    } else {
      return null;
    }
  }

  // Finds the position of a target value within a sorted array. Binary search compares the target
  // value to the middle element of the array. If they are not equal, the half in which the target
  // cannot lie is eliminated and the search continues on the remaining half, again taking the
  // middle element to compare to the target value, and repeating this until the target value is
  // found. If the search ends with the remaining half being empty, the target is not in the array.
  // Average performance: O(log n).
  public static Comparable<Object> binarySearch(Comparable<Object>[] list,
      Comparable<Object> target) {
    int min = 0;
    int max = list.length - 1;
    int mid = 0;
    boolean found = false;

    while (!found && min <= max) {
      mid = (min + max) / 2;

      if (list[mid].compareTo(target) == 0) {
        found = true;
      } else {
        if (target.compareTo(list[mid]) < 0) {
          max = mid - 1;
        } else {
          min = mid + 1;
        }
      }
    }

    if (found) {
      return list[mid];
    } else {
      return null;
    }
  }
}
