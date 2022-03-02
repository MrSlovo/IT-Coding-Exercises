
import java.util.Arrays;
import javax.swing.JOptionPane;

public class InputUnknown {
  public static void main(String[] args) {
   int[] numArr = new int[100];
   int userIntput, size = 0, evenNumbers = 0;
   
  do {
    userIntput = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer Value"));
    size++;
    if (userIntput % 2 == 0) {
      evenNumbers++;
    }
  } while (userIntput != 0);
    
    System.out.println("Numbers entered: " + size);
    System.out.println("Even numbers entered: " + evenNumbers);
  }
  

}
