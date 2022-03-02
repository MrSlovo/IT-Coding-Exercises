
import javax.swing.JOptionPane;

public class TypeCastChar {
    public static void main (String[] args) {
        int num;
        String numStr;
        char letter;
        numStr = JOptionPane.showInputDialog("Please Enter a Number");
        num = Integer.parseInt(numStr);
        letter = (char) num;
        System.out.println(letter);
    }
    
}
