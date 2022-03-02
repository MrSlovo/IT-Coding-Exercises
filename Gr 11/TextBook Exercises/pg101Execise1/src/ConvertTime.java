
import java.time.LocalTime;
import java.util.Scanner;

public class ConvertTime {

  public static void main(String[] args) {
    System.out.println("Enter time in format hh:mm:ss");
    Scanner input = new Scanner(System.in).useDelimiter(":");

    int hour = input.nextInt();
    int min = input.nextInt();
    int sec = input.nextInt();

    try {
      LocalTime timeInput = LocalTime.of(hour, min, sec);
      System.out.println("The time is: " + timeInput);
    } catch (Exception e) {
      System.out.println("Problem instantiating object");
    }

    input.close();
  }
}
