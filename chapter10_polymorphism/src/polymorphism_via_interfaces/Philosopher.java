package polymorphism_via_interfaces;

public class Philosopher implements Speaker {
  @Override
  public void speak() {
    System.out.println("Philosopher speaking!");
  }
}
