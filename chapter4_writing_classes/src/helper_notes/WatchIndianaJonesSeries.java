package helper_notes;

public class WatchIndianaJonesSeries {
  // An example of a constant
  private final static String DIRECTOR = "Steven Spielberg";

  public static void main(String[] args) {
    Movie movie1 = new Movie("Indiana Jones and the Raiders of the Lost Ark", DIRECTOR, 115);
    watchMovie(movie1);

    Movie movie2 = new Movie("Indiana Jones and the Temple of Doom", DIRECTOR, 118);
    watchMovie(movie2);

    Movie movie3 = new Movie("Indiana Jones and the Last Crusade", DIRECTOR, 128);
    watchMovie(movie3);

    Movie movie4 = new Movie("Indiana Jones and the Kingdom of the Crystal Skull", DIRECTOR, 122);
    watchMovie(movie4);
  }

  public static void watchMovie(Movie movie) {
    System.out.println(movie); // toString is automatically called
    movie.startMovie();
    System.out.println("Movie started.\nEating popcorn.\nDid you finish the movie?: "
        + (movie.isWatched() ? "Yes" : "No") + "\n");
  }
}
