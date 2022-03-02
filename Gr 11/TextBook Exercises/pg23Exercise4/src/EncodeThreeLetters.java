
import java.util.Scanner;

public class EncodeThreeLetters {
  public static void main(String[] args) {
    
  }
  public static String inputWord() {
    Scanner scan = new Scanner(System.in);
    String word = scan.next().toUpperCase();
    return word;
  }
  public static char toNextLetter(char letter) {
    if (letter == 'Z') {
      return 'A';
    }
    letter++;
    return letter;
  }
}
