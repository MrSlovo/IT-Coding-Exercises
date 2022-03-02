
import javax.swing.JOptionPane;

public class Heights {
   public static void main(String[] args) {
       double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
       double tallestHeight = height, shortestHeight = height;
       String tallestName = "", shortestName = "", name = "";

       while (height > -1) {
           name = JOptionPane.showInputDialog("Enter Your Name");
                     
           if (height > tallestHeight) {
               tallestHeight = height;
               name = tallestName;
           } else if (height < shortestHeight) {
               shortestHeight = height;
               shortestName = name;
           }
           
           height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
       }
       
       tallestHeight = (double)Math.round(tallestHeight * 10) / 10;
       shortestHeight = (double)Math.round(shortestHeight * 10) / 10;
       
       System.out.println("Tallest Height: "  + tallestName + " " + tallestHeight);
       System.out.println("Shortest Height: " + shortestName + " " + shortestHeight);
    }   
 
}
