
import javax.swing.JOptionPane;

public class Convert2DecPlaces {
    public static void main (String[] args) {
        
        double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number With 2 or More Decimal Places"));
        System.out.println(num);
        
        num *= 100;
        num = Math.round(num);
        num /= 100;
        
        System.out.println(num);
        
    }
    
}
