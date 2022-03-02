import javax.swing.JOptionPane;

public class Prices {
    public static void main(String[] args) {
        double price = 0;
        double num = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
        
        while (num != 0.999) {
            price += num;
            num = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
            System.out.print("Cost: " + num);
        }
        
        // Rounds to 2 decimal places 
        price = (double)Math.round(price * 100) / 100;
        
        // Outputs price and name of store
        System.out.println("Mart Mart\n");
        System.out.println("Sum of grocceries: " + price);
        
        System.out.println(Math.round(6.789));
        
    }
}

