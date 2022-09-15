package inheritance_example;

public class Book {
  // The protected modifier specifies that the member can only be accessed within its own package
  // (as with package-private) and, in addition, by a subclass of its class in another package.
  protected int pages;
  private String genre;

  public Book(int pages, String genre) {
    this.pages = pages;
    this.genre = genre;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String toString() {
    return "Pages: " + pages + "\nGenre: " + genre + "\n";
  }
}
