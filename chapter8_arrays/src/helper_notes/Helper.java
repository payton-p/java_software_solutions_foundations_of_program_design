package helper_notes;

public class Helper {
  // I prefer the following syntax for array declarations, as opposed to int intArray[];
  int[] intArray = new int[10];

  // Declaring array literal
  int[] arrayLiteral = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  // List vs. ArrayList vs. array (from https://www.geeksforgeeks.org/)

  // List is a child interface of Collection. It is an ordered collection of objects in which
  // duplicate values can be stored. Since List preserves the insertion order, it allows positional
  // access and insertion of elements. List interface is implemented by the classes of ArrayList,
  // LinkedList, Vector, and Stack. List is an interface, and the instances of List can be created
  // by implementing various classes.

  // ArrayList is basically a part of the collection framework and is present in java.util package.
  // It provides us with dynamic arrays in Java. This class implements the List interface. Similar
  // to a List, the size of the ArrayList is increased automatically if the collection grows or
  // shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly
  // access the list. ArrayList can not be used for primitive types, like int, char, etc. We need a
  // wrapper class for such cases.

  // An array is a basic functionality provided by Java. ArrayList is part of the collection
  // framework in Java. Therefore array members are accessed using [], while ArrayList has a set of
  // methods to access elements and modify them. The array is a fixed-size data structure while
  // ArrayList is not. One need not mention the size of the ArrayList while creating its object.
  // Even if we specify some initial capacity, we can add more elements. An array can contain both
  // primitive data types as well as objects of a class depending on the definition of the array.
  // However, ArrayList only supports object entries, not the primitive data types. Since ArrayList
  // can’t be created for primitive data types, members of ArrayList are always references to
  // objects at different memory locations (See this for details). Therefore in ArrayList, the
  // actual objects are never stored at contiguous locations. References of the actual objects are
  // stored at contiguous locations. On the other hand, in the array, it depends whether the array
  // is of primitive type or object type. In the case of primitive types, actual values are
  // contiguous locations, but in the case of objects, allocation is similar to ArrayList. Java
  // ArrayList supports many additional operations like indexOf(), remove(), etc. These functions
  // are not supported by Arrays.
}
