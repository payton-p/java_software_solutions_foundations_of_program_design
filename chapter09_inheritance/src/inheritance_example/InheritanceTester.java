package inheritance_example;

public class InheritanceTester {
  public static void main(String[] args) {
    // Java only supports single inheritance, i.e., it does not support multiple inheritance.
    // Instead, we can rely on interfaces. Although a Java class can be derived from only one parent
    // class, it can implement multiple interfaces.

    Book generalBook = new Book(150, "Book", "Fiction"); // parent class
    Dictionary webster = new Dictionary(1700, "Webster's Dictionary", "Nonfiction", 53000); // child

    System.out.println(generalBook.toString());
    System.out.println("Ratio\n" + webster.getDefinitionsToPagesRatio() + "\n");
    System.out.println(webster.toString() + "\n"); // overridden method

    // This references the private variable genre of the parent indirectly
    System.out.println(webster.getGenre());
  }
}
