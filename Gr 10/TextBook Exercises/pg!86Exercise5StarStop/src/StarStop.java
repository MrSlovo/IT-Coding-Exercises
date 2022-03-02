
import javax.swing.JOptionPane;

public class StarStop {
    public static void main(String[] args) {
        String characterEntered = JOptionPane.showInputDialog("Enter a Character");
        int numOfchars = 0;
        
        while (!characterEntered.equals("*")) {
            numOfchars++;
            characterEntered = JOptionPane.showInputDialog("Enter a Character");
        }
        
        System.out.println(numOfchars);
    }
}
