
import java.util.Scanner;

public class ReplaceChar {

  public static void main(String[] args) {
    String input = inputStringValue();
    System.out.println(replaceChar(input));
  }

  public static String inputStringValue() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter String Value: ");
    return scan.next();
  }

  public static String replaceChar(String input) {
    String newString = "";
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ' ') {
        sout
      }
    }
    return newString;
  }
}
