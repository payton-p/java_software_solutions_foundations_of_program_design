package polymorphism_via_inheritance;

// Polymorphism lets us treat similar objects in consistent but unique ways.

// The binding of a method invocation to its definition is performed at run time for a polymorphic
// reference. This deferred commitment is called late binding or dynamic binding.

// When we declare a reference variable using a particular class name, it can be used to refer to
// any object of that class. In addition, it can also refer to any object of any class that is
// related to its declared type by inheritance. Example:
// Mammal pet;
// Horse horse = new Horse();
// pet = horse; // this is a valid assignment

// The reverse operation, can also be done, but it requires an explicit cast, and should typically
// be avoided.

// The type of the object, not the type of the reference, is used to determine which version of a
// method to invoke.

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}


class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}


class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}


class PolymorphismViaInheritanceTester {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
