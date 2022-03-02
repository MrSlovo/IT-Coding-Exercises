
import java.util.Scanner;

public class Password {
  
  public static void main(String[] args) {
    String password = readPass();
System.out.println(num);
    System.out.println(checkValidity(valid(password), specialChars(password)));
  }
  public static String readPass() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Password: ");
    return scan.next();
  }
  public static boolean valid(String password) {
    return password.length() >= 6;
  }
  public static int specialChars(String password) {
    String[] specialChars = {"$", "@", "#", "&"};
    int numOfIncludedChars = 0;
    for (String character : specialChars) {
      if (password.contains(character)) {
       numOfIncludedChars += 1;
      }
    }
    return numOfIncludedChars;
  }
  public static String checkValidity(boolean validLength, int specialCharsIncluded) {
    if (validLength && specialCharsIncluded >= 2) {
      return "The password is valid";
    }
    return "The password is invalid";
  }
}
