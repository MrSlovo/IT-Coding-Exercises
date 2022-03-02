
import java.util.Scanner;

public class CapsAndVowels {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inputStr = input.next().toUpperCase();
    String vowels = "AEIOU";
    String newStr = "";
    
    for (int i = 0; i < newStr.length(); i++) {
      if (vowels.indexOf(inputStr.charAt(i)) == -1) {
        newStr += inputStr.charAt(i);
      }
    }
    System.out.println(newStr);
  }
}
