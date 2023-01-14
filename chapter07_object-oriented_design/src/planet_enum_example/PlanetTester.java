package planet_enum_example;

public class PlanetTester {
  public static void main(String[] args) {
    Planet earth = Planet.EARTH;
    double earthWeight = 140;
    double mass = earthWeight / earth.surfaceGravity();

    for (Planet planet : Planet.values())
      System.out.printf("Your weight on %s is %f%n", planet, planet.surfaceWeight(mass));
  }
}
