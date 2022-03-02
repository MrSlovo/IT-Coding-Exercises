
import javax.swing.JOptionPane;

public class Rainfall {
    public static void main(String[] args) {
        double rainFall = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount of Rainfall"));
        double maxRainFall = rainFall, avgRainFall;
        int day = 0, maxRainFallDay;
        
        while (rainFall > -1) {
            rainFall = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount of Rainfall"));
            
            if (rainFall > maxRainFall) {
                maxRainFall = rainFall;
                maxRainFallDay = day;
            }
            
            day++;
        }
        
    }   
}
