package helper_notes;

public class Movie {
  // Keep encapsulation in mind
  private String title;
  private String director;
  private int runningTime;
  private boolean watched;

  // Define the class's constructor
  public Movie(String movieTitle, String movieDirector, int movieLengthInMinutes) {
    title = movieTitle;
    director = movieDirector;
    runningTime = movieLengthInMinutes;
    watched = false;
  }

  // Include getters and setters for the class's variables
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public int getRunningTime() {
    return runningTime;
  }

  public void setRunningTime(int runningTime) {
    this.runningTime = runningTime;
  }

  public boolean isWatched() {
    return watched;
  }

  public void setWatched(boolean watched) {
    this.watched = watched;
  }

  public void startMovie() {
    setWatched(true);
  }

  public String toString() {
    String movieInfo = "Title: " + title + "\nDirector: " + director + "\nRunning Time: "
        + runningTime + "\nWatched: " + watched;

    return movieInfo;
  }
}
