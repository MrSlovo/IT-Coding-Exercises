
import javax.swing.JOptionPane;

public class ConvertChars {

  public static void main(String[] args) {

    char inputChar;

    do {
      inputChar = JOptionPane.showInputDialog("Enter a Letter").charAt(0);

      if (Character.isDigit(inputChar)) {
        int num = Integer.parseInt(Character.toString(inputChar));
        System.out.println(Math.pow(num, 2));
      } else if (Character.isLetter(inputChar)) { 
        System.out.println(Character.toUpperCase(inputChar));
      } else if (inputChar == ' ') {
        int num = inputChar;
        System.out.println(num);
      }

    } while (!(Character.isLetter(inputChar) || inputChar != ' '));


  }
}
