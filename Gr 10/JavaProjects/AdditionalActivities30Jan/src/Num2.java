
import javax.swing.JOptionPane;

public class Num2 {
    public static void main(String[] args) {
        
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter The Breadth"));
        int breadth = Integer.parseInt(JOptionPane.showInputDialog("Enter The Length"));
        
        System.out.println("The Area of the Rectangle is: " + (length * breadth));
        System.out.println("The Perimeter is: " + (length + breadth));
        System.out.println("The Breadth is: " + breadth);
        System.out.println("The Length is: " + length);
    }
    
}
