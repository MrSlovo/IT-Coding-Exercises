
import javax.swing.JOptionPane;

public class AvgGirlsNames {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Last Name");
        int numOfNames = 0;
        double totalLength  = 0, avgLength; 
        
        while(!name.equals("*")) {
            numOfNames++;
            totalLength += name.length();
            name = JOptionPane.showInputDialog("Enter Last Name");
        }
        
        avgLength = (double)totalLength / numOfNames;
        
        System.out.println(avgLength);
    }
}
