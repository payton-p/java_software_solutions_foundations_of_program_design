package season_enum_example;

public class SeasonTester {
  public static void main(String[] args) {
    for (Season season : Season.values()) {
      System.out.println(season);
    }
  }
}
