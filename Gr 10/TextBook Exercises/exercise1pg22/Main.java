
import javax.swing.JOptionPane;


public class Main {
    public static void main (String[] args) {
      display(inputs());
    }
    public static String inputs() {
        String name = JOptionPane.showInputDialog("Enter a word");
        return name;
    }
    public static void display(String string) {
        System.out.println("Your word was: " + string);
    }
    
}
