package sorting;

import inheritance_example.Book;

public class LibraryOrganizer {
  public static void main(String[] args) {
    Book[] library = new Book[3];

    library[0] = new Book(100, "Peter and Wendy", "Fiction");
    library[1] = new Book(323, "Frankenstein", "Fiction");
    library[2] = new Book(145, "The Bell Jar", "Fiction");

    Sorting.selectionSort(library);

    for (Book book : library) {
      System.out.println(book);
    }
  }
}
