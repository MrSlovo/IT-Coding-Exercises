
import java.util.Scanner;

public class CheckChar {

  public static void main(String[] args) {
    String input = inputStringValue();
    while (!input.equals("last")) {
      System.out.println("Your word was: " + input);
      input = input.toLowerCase();
      String msg = !input.contains("-") ? "Your word does not contain a hyphen" : "Your word contains a hyphen";
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
