
import java.time.LocalTime;

public class Goat extends Sick {

  private boolean goingHome;
  private LocalTime timeLeft;

  public Goat(char goingHome, LocalTime timeLeft, String name, String date) {
    super(name, date);

    this.goingHome = Character.toString(goingHome).equalsIgnoreCase("Y");
    this.timeLeft = timeLeft;

  }

  public boolean getGoingHome() {
    return goingHome;
  }

  public void setTimeLeft(LocalTime timeLeft) {
    this.timeLeft = timeLeft;
  }

  @Override
  public String toString() {
    return "Goat{" + "goingHome=" + goingHome + ", timeLeft=" + timeLeft + "name=" + this.getName() + ", date=" + this.getDate().toString() + ", NURSE=" + NURSE + '}';
  }

}
