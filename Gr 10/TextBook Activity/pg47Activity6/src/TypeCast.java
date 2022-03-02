import javax.swing.JOptionPane;

public class TypeCast {
    public static void main(String[] args) {
        
        double realNum =  Double.parseDouble(JOptionPane.showInputDialog("Enter Real Number"));
        int intNum = (int) realNum;
        
        System.out.println("The real number is :" + realNum);
        System.out.println("The number, cast to an integer, is: " + intNum);

    }
}