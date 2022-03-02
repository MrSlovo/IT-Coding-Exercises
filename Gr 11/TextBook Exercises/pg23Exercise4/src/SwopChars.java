
import java.util.Scanner;

public class SwopChars {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word1 = scan.next(), word2 = scan.next();
    
    System.out.println(word2.substring(0, 1) + word1.substring(1, word1.length()));
    System.out.println(word1.substring(0, 1) + word2.substring(1, word2.length()));
  }
}
