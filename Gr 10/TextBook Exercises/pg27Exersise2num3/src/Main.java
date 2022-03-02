
import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        String product1 = JOptionPane.showInputDialog("Enter the First Product:");
        double product1Price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of The Product:"));
        String product2 = JOptionPane.showInputDialog("Enter the Second Product:");
        double product2Price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of The Product:"));
        String product3 = JOptionPane.showInputDialog("Enter the Third Product:");
        double product3Price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of The Product:"));
    
        System.out.println("\nShopping List:\n");
        System.out.println(product1 + ":" + product1Price);
        System.out.println(product2 + ":" + product2Price);
        System.out.println(product3 + ":" + product3Price);
    }
    
}
