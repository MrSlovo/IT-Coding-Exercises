
import javax.swing.JOptionPane;

public class QuantityPosInts {
    public static void main(String[] args) 
    {
        double upperLimit = Double.parseDouble(JOptionPane.showInputDialog("Enter The Upper Limit"));
        int total = 0, currentNum = 0;
        
        do {
            currentNum = Integer.parseInt(JOptionPane.showInputDialog("Enter A Num"));
            total += currentNum;
            System.out.println("current total: " + total);
        } while (upperLimit > total);
       
    }
}
