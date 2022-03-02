
import javax.swing.JOptionPane;

public class CountWords {

  public static void main(String[] args) {
    int numOfwords = 0;
    String userInput = JOptionPane.showInputDialog("EnTeR A WOrD");
    while (!userInput.equalsIgnoreCase("stop")) {
      numOfwords++;
      userInput = JOptionPane.showInputDialog("EnTeR A WOrD");
    }
    System.out.println("THe NumBEr oF wORds iS: " + numOfwords);
  }
}
