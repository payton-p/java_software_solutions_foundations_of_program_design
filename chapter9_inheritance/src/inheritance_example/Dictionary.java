package inheritance_example;

public class Dictionary extends Book {
  private int definitions;

  // We want to avoid shadowing variables, i.e., declare variables in a child class that have the
  // same name as ones in the parent

  // Constructors are not inherited
  public Dictionary(int pages, String genre, int definitions) {
    super(pages, genre); // invokes the constructor of the parent class

    this.definitions = definitions;
  }

  // The attribute pages is pulled from the parent class because it has the protected modifier
  public String getDefinitionsToPagesRatio() {
    return definitions + " : " + pages;
  }

  public int getDefinitions() {
    return definitions;
  }

  public void setDefinitions(int definitions) {
    this.definitions = definitions;
  }

  // Example of overriding a method (on the flip side, if a parent method uses the final modifier,
  // the method cannot be overridden).
  public String toString() {
    // This explicitly invokes the parent's version of the method
    return super.toString() + "Definitions: " + definitions;
  }
}
