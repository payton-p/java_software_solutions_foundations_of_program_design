package abstract_classes;

// Java Program to illustrate that an instance of Abstract Class can not be created. Example from:
// https://www.geeksforgeeks.org/abstract-classes-in-java/

// An abstract class cannot be instantiated and usually contains one or more abstract methods, which
// have no definition. But it can contain methods that are not abstract. It can also contain data
// declarations other than constants. Any class that contains one or more abstract methods must be
// declared abstract. But a class declared abstract does not have to contain abstract methods.
// Abstract classes serve as placeholders in a class hierarchy. There are no restrictions as to
// where in a class hierarchy an abstract class can be defined. Usually they are located at the
// upper levels of a class hierarchy. However, it is possible to derive an abstract class from a
// nonabstract parent. Abstract classes should be used primarily for objects that are closely
// related, whereas interfaces are best suited for providing a common functionality to unrelated
// classes. If the functionality we are creating will be useful across a wide range of disparate
// objects, use an interface. If we are designing small, concise bits of functionality, use
// interfaces. If we are designing large functional units, use an abstract class.
abstract class Base {
  abstract void fun();
}


// A class derived from an abstract parent must override all of its parent's abstract methods, or
// the derived class will also be considered abstract.
class Derived extends Base {
  void fun() {
    System.out.println("Derived fun() called");
  }
}


class AbstractClassTester {
  public static void main(String args[]) {
    // Uncommenting the following line will cause compiler error as the line tries to create an
    // instance of abstract class.
    // Base b = new Base();

    // We can have references of Base type
    Base b = new Derived();
    b.fun();
  }
}
