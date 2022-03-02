
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q1MathDay {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Enter Name");
        
        System.out.println(name + "\nWelcome to Math Day\n");
        
        for (int loop = 0; loop < 11; loop++) {
            System.out.print(loop + " ");
        }
        
        System.out.println("");
        
        for (int loop = 9; loop >= 0; loop--) {
            System.out.print(loop + " ");
        }
        
        scan.close();
    }
}
