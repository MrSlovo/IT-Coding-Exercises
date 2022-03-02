
import java.util.Scanner;

public class CountIn {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.next();
    int numOfIn = 0;
    
    for (int i = 0; i < sentence.length() - 1; i++) {
      if (sentence.charAt(i) == 'i') {
        if (sentence.charAt(i + 1) == 'n') {
          numOfIn++;
        }  
      }
    }
    
    System.out.println(numOfIn);
  }
}
