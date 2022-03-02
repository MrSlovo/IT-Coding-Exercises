
import javax.swing.JOptionPane;

public class CompareStrings {
    public static void main(String[] args) {
        String stg1, stg2, message = "";
        stg1 = "HELLO".toLowerCase();
        stg2 = JOptionPane.showInputDialog("Enter stuff").toLowerCase();
        
        if (stg1.equals(stg2)) {
            message = "The Strings Are Equal";
        } else {
            message = "The Strings Are Not Equal";
        }
    }
}
