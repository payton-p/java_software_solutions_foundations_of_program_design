package polymorphism_via_interfaces;

public class Poet implements Speaker {
  @Override
  public void speak() {
    System.out.println("Poet speaking!");
  }
}
