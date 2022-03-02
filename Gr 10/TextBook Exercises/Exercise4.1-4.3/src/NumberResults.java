
import javax.swing.JOptionPane; 

public class NumberResults {
    public static void main (String[] args) {
        
         double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please Enter a Number"));
         double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Another Number"));
         double result = num1 * num2;
         
         JOptionPane.showMessageDialog(null, "Your First Number is: " + num1 + "\nYour Second Number is: " + num2 + "\nThe Product of Your Numbers is: " + result, "Number Results", JOptionPane.PLAIN_MESSAGE);
         
    }
    
}
