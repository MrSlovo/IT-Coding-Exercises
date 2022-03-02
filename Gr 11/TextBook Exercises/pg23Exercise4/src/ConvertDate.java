
import java.util.Scanner;

public class ConvertDate {
  public static void main(String[] args) {
    String dateInput = inputDate();
    String formattedDate = convertDate(dateInput);
    System.out.println(formattedDate);
  }
  public static String inputDate() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the date in format DDMMYY");
    String date = scan.next();
    return date;
  }
  public static String convertDate(String date) {
    String day = "" + date.charAt(0) + date.charAt(1);
    String month = "" + date.charAt(2) + date.charAt(3);
    String year = "" + date.charAt(4) + date.charAt(5);
    return (removeFluff(year) + '/' + removeFluff(month) + '/' + removeFluff(day));
  }
  public static String removeFluff(String date) {
    if (date.charAt(0) == '0') {
      return "" + date.charAt(1);
    }
    return date;
  }
}
