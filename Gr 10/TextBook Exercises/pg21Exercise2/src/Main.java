import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        String name, subject;
        
        name = JOptionPane.showInputDialog("Enter your name");
        subject = JOptionPane.showInputDialog("Enter your subject");
        
        System.out.println("*******************************");
        System.out.println(name);
        System.out.println(subject);
        System.out.println("*******************************");
        
    }
    
}
