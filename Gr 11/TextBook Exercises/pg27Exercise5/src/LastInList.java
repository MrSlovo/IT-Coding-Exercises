
import java.util.Scanner;

public class LastInList {

  public static void main(String[] args) {
    String lastNameAlphebitically = "", name = inputStringValue();
    int numOfNames = 0;
    while (!name.equals("@@@")) {
      numOfNames++;
      lastNameAlphebitically = lastNameAlphebitically.compareToIgnoreCase(name) < 1 ? name : lastNameAlphebitically;
      name = inputStringValue();
    }
    System.out.println("Num of names input: " + numOfNames);
    System.out.println("Last name aplhabetically: " + lastNameAlphebitically);
  }

  public static String inputStringValue() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter String Value: ");
    return scan.next();
  }
}
