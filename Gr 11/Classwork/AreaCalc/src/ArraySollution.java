
import javax.swing.JOptionPane;

public class ArraySollution {

  public static void main(String[] args) {
    double[] values = inputValues();
    double len = values[0];
    double wid = values[1];
    double area = calcArea(len, wid);
    display(len, wid, area);
  }

  public static double[] inputValues() {
    double len = Double.parseDouble(JOptionPane.showInputDialog("Input Length"));
    double wid = Double.parseDouble(JOptionPane.showInputDialog("Input Length"));
    double[] values = {len, wid};
    return values;
  }

  public static double calcArea(Double len, Double wid) {
    return len * wid;
  }

  public static void display(Double len, Double wid, Double area) {
    System.out.println("Length:\t" + len);
    System.out.println("Width:\t" + wid);
    System.out.println("Area:\t" + area);
  }
}
