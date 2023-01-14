package inheritance_example;

public class Book implements Comparable<Object> { // this interface relates to chapter 10
  // The protected modifier specifies that the member can only be accessed within its own package
  // (as with package-private) and, in addition, by a subclass of its class in another package.
  protected int pages;
  private String title;
  private String genre;

  public Book(int pages, String title, String genre) {
    this.pages = pages;
    this.setTitle(title);
    this.genre = genre;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String toString() {
    return "Title: " + title + "\nPages: " + pages + "\nGenre: " + genre + "\n";
  }

  // This relates to chapter 10 and sorting
  @Override
  public int compareTo(Object object) {
    String otherTitle = ((Book) object).getTitle();
    int result = title.compareTo(otherTitle);

    return result;
  }
}
