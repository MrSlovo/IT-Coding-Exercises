import java.time.*;

public class CurrentDateTime {

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);
    LocalDate date = LocalDate.now();
    System.out.println(date);
    LocalTime time = LocalTime.now();
    System.out.println(time);
  }
}
