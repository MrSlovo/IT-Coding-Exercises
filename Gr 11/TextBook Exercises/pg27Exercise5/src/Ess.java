
import java.util.Scanner;

public class Ess {

  public static void main(String[] args) {
    String input = inputStringValue();
    while (!input.equals("last")) {
      System.out.println("Your word was: " + input);
      input = input.toLowerCase();
      String msg = !input.contains("s") ? "Your word does not contain a 's'" : "Your word contains a 's";
      System.out.println(msg);
      input = inputStringValue();
    }
  }

  public static String inputStringValue() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter String Value: ");
    return scan.next();
  }

}
