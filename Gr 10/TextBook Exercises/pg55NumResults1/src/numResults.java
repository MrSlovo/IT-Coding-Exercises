
import javax.swing.JOptionPane;

public class numResults {
    public static void main (String[] args) {
        double realNumber = Double.parseDouble(JOptionPane.showInputDialog("Please Enter a Number"));
        double intNumber = Integer.parseInt(JOptionPane.showInputDialog("To Which Power Should the Power be Raised to"));
        double squareRoot = Math.sqrt(realNumber);
        double power2 = Math.pow(realNumber, intNumber);
        
        System.out.print("Real Number\t");
        System.out.print("Square Root\t");
        System.out.println("Raised to Power " + intNumber);
        System.out.print(realNumber + "\t\t");
        System.out.print(squareRoot + "\t");
        System.out.println(power2);
    }
    
}
