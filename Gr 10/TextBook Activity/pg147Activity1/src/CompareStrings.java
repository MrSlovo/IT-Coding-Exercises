
import javax.swing.JOptionPane;

public class CompareStrings {
    public static void main(String[] args) {
        String stg1, stg2, message = "";
        stg1 = "Hello";
        stg2 = JOptionPane.showInputDialog(" Type any word and <Enter>");
        
        if (stg1.equals(stg2)) {
            message = "The strings are equal";
        } else {
            message = "The strings are NOT equal";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
