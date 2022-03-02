
import javax.swing.JOptionPane;

public class TypeCastChar2 {
    public static void main (String[] args) {
        int num;
        String numStr;
        char ch;
        numStr = JOptionPane.showInputDialog("Please Enter a Character");
        ch = numStr.charAt(0);
        num = (int) ch;
        System.out.println(num);
    }
    
}
