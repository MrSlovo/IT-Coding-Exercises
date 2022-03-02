
import javax.swing.JOptionPane;

public class StringLengths {
    public static void main (String[] args) {
        String name1, name2, message;
        name1 = JOptionPane.showInputDialog("Enter Name 1");
        name2 = JOptionPane.showInputDialog("Enter Name 2");
        message = JOptionPane.showInputDialog("Enter a Message");
        System.out.println(name1 + " has " + name1.length() + " characters in it ");
        
        System.out.println();
        System.out.println(name2 + " has " + name2.length() + " characters in it");
        
        System.out.println();
        System.out.println(message + " has " + message.length() + " characters in it");
        
    }
    
}
