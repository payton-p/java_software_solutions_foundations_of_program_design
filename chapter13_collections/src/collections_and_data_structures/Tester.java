package collections_and_data_structures;

import java.util.LinkedList;

// A collection is an object that serves as a repo for other objects. A crucial aspect of
// collections is that they can be implemented in a variety of ways. That is, the underlying
// data structure that stores the objects can be implemented using various techniques. "Abstract
// data type" (or ADT) is a term that is essentially interchangeable with the term
// collection.
public class Tester {
  public static void main(String[] args) {
    // Dynamically linked list - Singly linked list
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
    singlyLinkedList.addNode("1");
    singlyLinkedList.addNode("2");
    singlyLinkedList.addNode("3");
    singlyLinkedList.addNode("4");
    System.out.println("Singly linked list:\n" + singlyLinkedList);

    // Dynamically linked list - Doubly linked list
    LinkedList<String> names = new LinkedList<String>();
    names.add("Xavier");
    names.add("Logan");
    System.out.println("\n\nDoubly linked list:");
    System.out.println(names);
  }
}
