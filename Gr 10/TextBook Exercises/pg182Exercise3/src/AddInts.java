import javax.swing.JOptionPane;

public class AddInts {
    public static void main(String[] args) {
        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Num"));
        while (num != -99) {
            sum += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter Num"));
        }
        System.out.println("Sum of numbers entered: " + sum);
    }
}