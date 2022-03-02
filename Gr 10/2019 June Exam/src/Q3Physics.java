
import javax.swing.JOptionPane;

public class Q3Physics {
    public static void main(String[] args) {
        // Gets user input
        distance = Double.parseDouble(JOptionPane.showInputDialog("Enter the distance the car will travel"));
        distanceUnit = JOptionPane.showInputDialog("Is it measured in m – meters or k – kilometres. Enter letter only");
        timeTraveled = Integer.parseInt(JOptionPane.showInputDialog("Enter the time the car will travel"));
        timeUnit = JOptionPane.showInputDialog("Is it measured in s – seconds or h – hours. Enter letter only");
    }    
}
