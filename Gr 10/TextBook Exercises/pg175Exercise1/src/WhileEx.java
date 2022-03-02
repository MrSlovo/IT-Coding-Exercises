import java.util.Scanner;
import javax.swing.JOptionPane;

public class WhileEx {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int num, lastNum;
       
       System.out.println("Enter Starting Num");
       num = Integer.parseInt(JOptionPane.showInputDialog(scan));
       
       System.out.println("Enter End Num");
       lastNum = Integer.parseInt(JOptionPane.showInputDialog(scan));
       
       scan.close();
       
       while (num <= lastNum) {
           if (num % 4 == 0) {
               System.out.print(num + "  ");
           }
           num++;
       }
    }
}
