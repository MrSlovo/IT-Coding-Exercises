
import javax.swing.JOptionPane;

public class Competition {

  public static void main(String[] args) {
    // Declar array and a size variable
    String[] nameArr = new String[50];
    int sizeOfArray = 0;
    String inputName;

    // Input an unknown amount of names
    do {
      inputName = JOptionPane.showInputDialog("Enter Users Name");
      nameArr[sizeOfArray] = inputName;
      sizeOfArray++;
    } while (!"*".equals(inputName));

    // Sort names alphabetically
    for (int i = 0; i < nameArr.length; i++) {
      for (int j = ++i; j < nameArr.length; j++) {

      }
    }

  }
}
