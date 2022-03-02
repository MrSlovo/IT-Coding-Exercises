
import javax.swing.JOptionPane;

public class CountLetterDigits {
  public static void main(String[] args) {
    char inputChar;
    int numOfLetters = 0, numOfDigits = 0, numOfOther = 0;    
    do {
     inputChar = JOptionPane.showInputDialog("Enter a Letter").charAt(0);
     
     if (Character.isDigit(inputChar)) {
       numOfDigits++;
     } else if (Character.isLetter(inputChar)) {
       numOfLetters++;
     } else {
       numOfOther++;
     }     
    } while (inputChar != 'x');
    numOfLetters--;
    
    System.out.println("Number of Digits:\t" + numOfDigits);
    System.out.println("Number of Letters:\t" + numOfLetters);
    System.out.println("Number of Other:\t" + numOfOther);
  }
}
