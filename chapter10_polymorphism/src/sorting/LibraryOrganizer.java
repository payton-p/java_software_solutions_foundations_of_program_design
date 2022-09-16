package sorting;

import inheritance_example.Book;

public class LibraryOrganizer {
  private static Book[] createUnsortedLibrary() {
    Book[] library = new Book[3];

    library[0] = new Book(100, "Peter and Wendy", "Fiction");
    library[1] = new Book(323, "Frankenstein", "Fiction");
    library[2] = new Book(145, "The Bell Jar", "Fiction");

    return library;
  }

  public static void main(String[] args) {
    // Selection sort testing
    Book[] library1 = createUnsortedLibrary();
    Sorting.selectionSort(library1);

    System.out.println("Selection Sort");
    for (Book book : library1) {
      System.out.println(book);
    }
    System.out.println();

    // Insertion sort testing
    Book[] library2 = createUnsortedLibrary();
    Sorting.insertionSort(library2);

    System.out.println("Insertion Sort");
    for (Book book : library2) {
      System.out.println(book);
    }
  }
}
