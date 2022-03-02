import javax.swing.JOptionPane;

public class Num1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Another Number"));
        
        System.out.println("The sum of your number is: " + (num1 + num2));
        System.out.println("The product of your number is: " + (num1 * num2));
        System.out.println("The quotient of your number is: " + (num1 / num2));
        System.out.println("The difference of your number is: " + (num1 - num2));
        
    }
    
}
