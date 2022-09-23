package collections_and_data_structures;

public class SinglyLinkedList<T> {
  class Node {
    public T data;
    public Node next; // pointer to next node in list

    public Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // Represent the head and tail of the singly linked list
  public Node head = null;
  public Node tail = null;

  public void addNode(T data) {
    Node newNode = new Node(data);

    // Checks if the list is empty
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  public String toString() {
    String printedList = "";

    // Node current will point to head
    Node current = head;

    if (head == null) {
      printedList = "List is empty";
    } else {
      while (current != null) {
        printedList += current.data + ", ";

        current = current.next;
      }

      printedList = "[" + printedList.substring(0, printedList.length() - 2) + "]";
    }

    return printedList;
  }
}
