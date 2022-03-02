
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double mark = Double.parseDouble(JOptionPane.showInputDialog("Enter the Learners Mark"));
        double percentage = Math.round((mark / 22) * 100);
        System.out.println(percentage);
    }
}
