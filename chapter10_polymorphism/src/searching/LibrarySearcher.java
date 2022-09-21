package searching;

import inheritance_example.Book;
import sorting.Sort;

public class LibrarySearcher {
  private static Book[] createLibrary() {
    Book[] library = new Book[3];

    library[0] = new Book(100, "Peter and Wendy", "Fiction");
    library[1] = new Book(323, "Frankenstein", "Fiction");
    library[2] = new Book(145, "The Bell Jar", "Fiction");

    return library;
  }

  private static void searchResult(Book found, String searchType) {
    if (found != null) {
      System.out.println(searchType + " Found -\n" + found);
    } else {
      System.out.println(searchType + " Found -\nThe book is not included in the library.\n");
    }
  }

  public static void main(String[] args) {
    Book[] library = createLibrary();
    Book bookToSearchFor = new Book(145, "The Bell Jar", "Fiction");

    Book found = (Book) Search.linearSearch(library, bookToSearchFor);
    searchResult(found, "Linear Search");

    // Elements in an array must be sorted for a binary search
    Sort.selectionSort(library);
    found = (Book) Search.binarySearch(library, bookToSearchFor);
    searchResult(found, "Binary Search");

    // Test a book that is not in the library
    Book bookNotInLibrary = new Book(220, "The Hobbit", "Fiction");
    found = (Book) Search.linearSearch(library, bookNotInLibrary);
    searchResult(found, "Linear Search");

    found = (Book) Search.binarySearch(library, bookNotInLibrary); // library is already sorted
    searchResult(found, "Linear Search");
  }
}
