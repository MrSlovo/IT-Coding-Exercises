
import java.time.LocalTime;
import java.util.Scanner;

public class ExtraTime {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Start Date: ");
    String startTimeInput = input.next();
    System.out.print("Enter End Date: ");
    String endTimeInput = input.next();

    try {
      LocalTime startTime = LocalTime.of(0, 0, 0);
    } catch (Exception e) {

    }
  }
}
