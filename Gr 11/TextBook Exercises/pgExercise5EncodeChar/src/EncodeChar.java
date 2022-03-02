
import javax.swing.JOptionPane;

public class EncodeChar {
    public static void main(String[] args) {
        // Input Char
        char inputChar = JOptionPane.showInputDialog("Enter a Letter").charAt(0);
        
        // Changes 'z' to a
        if (inputChar == 'z' || inputChar == 'Z') {
            inputChar -= 25;
        } else {
            // Increment Char Code
            inputChar += 1;            
        }      
               
        // Output Char
        System.out.println(inputChar);
    }
}
