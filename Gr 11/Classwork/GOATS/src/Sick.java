
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Sick {

  private String name;
  private LocalDate date;
  public final String NURSE = "La";
  private int daysIll;

  public Sick(String name, String date) {
    this.name = name;

    Scanner dateParser = new Scanner(date).useDelimiter("/");

    int day = dateParser.nextInt();
    int month = dateParser.nextInt();
    int year = dateParser.nextInt();

    this.date = LocalDate.of(year, month, day);
    
    this.daysIll = Period.between(this.date, LocalDate.now()).getDays();
  }

  public void setDate(String date) {
    Scanner dateParser = new Scanner(date).useDelimiter("/");

    int day = dateParser.nextInt();
    int month = dateParser.nextInt();
    int year = dateParser.nextInt();

    this.date = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public LocalDate getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "Sick{" + "name=" + name + ", date=" + date + ", NURSE=" + NURSE + '}';
  }

}
