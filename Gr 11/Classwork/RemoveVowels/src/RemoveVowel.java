
import java.util.Scanner;

public class RemoveVowel {
  public static void main(String[] args) {
    String input = inputStringValue();
    System.out.println(removeVowels(input));
  }
  public static String inputStringValue() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter String Value: ");
    return scan.next();
  }
  public static String removeVowels(String input) {
    String newString = "";
    for (int i = 0; i < input.length(); i++) {
      if ("AEIOUaeiou".indexOf(input.charAt(i)) == -1) {
        newString += input.charAt(i);
      }
    }
    return newString;
  }
}
