
import javax.swing.JOptionPane;

public class UsingMathMethods {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number"));
        System.out.println(Math.round(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.abs(num));
        System.out.println(Math.pow(num, 2));
        
        
    }
     
}
