
import javax.swing.JOptionPane;

public class Commision {
    public static void main(String[] args) {
        
        double totalSalesFigure = Double.parseDouble(JOptionPane.showInputDialog("Enter Total Sales Figure"));
        double commissionFigure;
        double commission;
        
        if (totalSalesFigure <= 500 && totalSalesFigure >= 0) {
            commissionFigure = 0.02;
        } else if (totalSalesFigure > 500 && totalSalesFigure <= 5000) {
            commissionFigure = 0.05;
        } else {
            commissionFigure = 0.08;
        }
        
        commission = totalSalesFigure * commissionFigure;
        
        System.out.println("Commision: " + commission);
        System.out.println("Total Sale Figure: " + totalSalesFigure);
        
    }
}