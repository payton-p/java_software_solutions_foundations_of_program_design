package polymorphism_via_interfaces;

// Polymorphism lets us treat similar objects in consistent but unique ways.

public class PolymorphismViaInterfacesTester {
  // A parameter to a method can be polymorphic, giving the method flexible control of its arguments
  public static void sayIt(Speaker current) {
    current.speak();
  }

  public static void main(String[] args) {
    // The reference variable can be used to refer to any object of any class that implements the
    // interface.
    Speaker currentSpeaker = new Philosopher(); // valid assignment
    currentSpeaker.speak();

    currentSpeaker = new Poet();
    currentSpeaker.speak();

    System.out.println();
    sayIt(currentSpeaker); // using a polymorphic method parameter
  }
}
