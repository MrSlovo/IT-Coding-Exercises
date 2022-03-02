
import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        String name, surname, phoneNumber;
        int birth;
        float  height;
        
        name = JOptionPane.showInputDialog("Enter your name");
        surname = JOptionPane.showInputDialog("Enter your surname");
        phoneNumber = JOptionPane.showInputDialog("Enter your phone number");
        birth = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth year"));
        height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height"));
        
        System.out.println("\nPersonal Details:\n");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Year of Birth: " + birth);
        System.out.println("Height (m): " + height);
        System.out.println("TelephoneNumber: " + phoneNumber + "\n");
         
    }
    
}
