
public class Actor {

  private String actID;
  private String name;
  private String surname;
  private boolean international;
  private int numMovies;
  private String movie;

  public Actor(String actID, String name, String surname, boolean international, int numMovies, String movie) {
    this.actID = actID;
    this.name = name;
    this.surname = surname;
    this.international = international;
    this.numMovies = numMovies;
    this.movie = movie;
  }

  public boolean isInternational() {
    return international;
  }

  public int getNumMovies() {
    return numMovies;
  }

  public String getMovie() {
    return movie;
  }

  public String getFullName() {
    return name + " " + surname;
  }

  @Override
  public String toString() {
    return getFullName() + "\t" + numMovies + "\t";
  }

}
