
import java.util.Scanner;

public class PrisonerUI {

  public static void main(String[] args) {
//    Prisoner inmate1 = new Prisoner("Jax", 30, 'B');
//    Prisoner inmate2 = new Prisoner("Axel", 13, 'A');
//    System.out.println(inmate1.toString());
//    System.out.println(inmate2.toString());
    ManagePrisoner manage = new ManagePrisoner();

    // 3.2
    System.out.println(manage.toString());

    // 3.4
    System.out.println("Total months (block A): " + manage.totalA());

    // 3.5
    System.out.println("Enter desired block to total");
    char inputChar = 'C';
//    char inputChar = new Scanner(System.in).next().charAt(0);
    System.out.println("Total months (block " + inputChar + "): " + manage.totalX(inputChar));

    // 3.6/7
    String convictName = "Yes";
    String msg = manage.getPrisonerSentence(convictName) == -1 ? "Error. Prisoner not found" : convictName + " sentence is: " + manage.getPrisonerSentence(convictName);
    System.out.println(msg + "\n");

    // 3.8
    System.out.println("Prisoners serving more than 20 months: ");
    System.out.println(manage.prisonersMoreThan20Months());

    // 3.9
    int numOfMonths = 60;
    System.out.println("Prisoners serving more than " + numOfMonths + " months: ");
    System.out.println(manage.prisonersMoreThanXMonths(numOfMonths));

    // 3.10
    manage.sortMonths();
    System.out.println("PRISONERS AFTER SORTING ACORDING TO MONTHS: ");
    System.out.println(manage.toString());

    // 3.11
    manage.sortName();
    System.out.println("PRISONERS AFTER SORTING ACORDING TO NAMES: ");
    System.out.println(manage.toString());
    
    // 3.12
    System.out.println("Enter prisor name to search");
    System.out.println(manage.prisonerExist(new Scanner(System.in).next()) ? "Prisoner exists" : "Prisoner does not exist"); 
  }
}
