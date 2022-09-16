package sorting;

// Both algorithms perform approximately n^2 number of comparisons, where n is the number of values
// in the list. We say that both selection and insertion sort are algorithms of order n^2.

// Implementing a sort algorithm polymorphically allows it to sort any comparable set of objects.
public class Sorting {
  // The selection sort algorithm sorts a list of values by successively putting particular values
  // in their final, sorted positions.
  public static void selectionSort(Comparable<Object>[] list) {
    int min;
    Comparable<Object> temp;

    for (int i = 0; i < list.length - 1; i++) {
      min = i;
      for (int scan = i + 1; scan < list.length; scan++) {
        if (list[scan].compareTo(list[min]) < 0)
          min = scan;
      }

      // Swap the values
      temp = list[min];
      list[min] = list[i];
      list[i] = temp;
    }
  }

  // The insertion sort algorithm sorts a list of values by repetitively inserting a particular
  // value into a subset of the list that has already been sorted. One at a time, each unsorted
  // element is inserted at the appropriate position in that sorted subset until the entire list is
  // in order.
  public static void insertionSort(Comparable<Object>[] list) {
    for (int i = 1; i < list.length; i++) {
      Comparable<Object> key = list[i];
      int position = i;

      // Shift larger values to the right
      while (position > 0 && key.compareTo(list[position - 1]) < 0) {
        list[position] = list[position - 1];
        position--;
      }

      list[position] = key;
    }
  }
}
