
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Friend {
  private String name;
  private LocalDate bDate;

  public Friend(String name, String dob) {
    this.name = name;
    this.bDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return Period.between(bDate, LocalDate.now()).getYears();
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setDate(String dob) {
    this.bDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }

  @Override
  public String toString() {
    return name + ": " + getAge();
  }
  
  
}
