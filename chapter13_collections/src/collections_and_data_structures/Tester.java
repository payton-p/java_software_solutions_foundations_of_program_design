package collections_and_data_structures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    System.out.println("Elements of singly linked list: " + singlyLinkedList);

    // Dynamically linked list - Doubly linked list
    LinkedList<String> names = new LinkedList<String>();
    names.add("Xavier");
    names.add("Logan");
    System.out.println("\nElements of doubly linked list: " + names);

    // Queue
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      queue.add(i);
    }
    System.out.println("\nElements of queue: " + queue);

    // Stack
    Stack<String> stack = new Stack<String>();
    stack.push("Welcome");
    stack.push("to");
    stack.push("Rome");
    System.out.println("\nElements of stack: " + stack);
  }
}
