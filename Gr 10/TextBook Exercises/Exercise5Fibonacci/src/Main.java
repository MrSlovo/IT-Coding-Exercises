
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int loop = Integer.parseInt(JOptionPane.showInputDialog("Enter Desired Lenght of Sequence"));
                
        // 0 1 1 2 3 5 8 13
        
        for (int i = 0; i < loop; i++) {
            num3 = num1 + num2;
            System.out.println(num1);
            num1 = num2;
            num2 = num3;
        }
    }
}
