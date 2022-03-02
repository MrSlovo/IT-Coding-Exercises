import java.util.Scanner;

public class Age {

  public static void main(String[] args) {
    int birtYear = inputBirthYr();
    int age = calcAge(birtYear, 2021);
    String msg = ("Your birth year " + birtYear);
    if (isLeapYear(birtYear)) {
      msg += " is a leap year";
    } else {
      msg += " is not a leap year";
    }
    System.out.println(msg);
    Factorials fact = new Factorials();
    System.out.println(fact.factorial(5));
  }

  public static int calcAge(int birthYear, int currentYear) {
    int age = currentYear - birthYear;
    return age;
  }

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0) {
      return true;
    }
    return false;
  }

  public static int inputBirthYr() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your birth year");
    int birtYear = scan.nextInt();
    scan.close();
    return birtYear;
  }
}
