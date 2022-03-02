
import java.util.Scanner;
import java.time.*;

public class InputDate {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    int month = scan.nextInt();
    int day = scan.nextInt();
    int hour = scan.nextInt();
    int min = scan.nextInt();
    int sec = scan.nextInt();
    try {
      LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, min, sec);
      System.out.println(dateTime);
      if (year % 4 == 0) {
        System.out.println("Tis a leap year");
      } 
    } catch (Exception e) {
      System.out.println("More L's :(");
    }
  }
}

