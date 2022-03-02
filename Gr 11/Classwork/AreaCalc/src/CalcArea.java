
import javax.swing.JOptionPane;

public class CalcArea {

  public static void main(String[] args) {
    double len = readValue("Length");
    double wid = readValue("Width");
    double area = calcArea(len, wid);
    display(len, wid, area);
  }

  public static double readValue(String valueName) {
    double value = Double.parseDouble(JOptionPane.showInputDialog("Input " + valueName));
    return value;
  }

  public static double calcArea(Double len, Double wid) {
    return len * wid;
  }

  public static void display(Double len, Double wid, Double area) {
    System.out.println("Width:\t" + wid);
    System.out.println("Length:\t" + len);
    System.out.println("Area:\t" + area);
  }
}
