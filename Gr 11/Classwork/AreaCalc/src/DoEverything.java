
import javax.swing.JOptionPane;

public class DoEverything {

  public static void main(String[] args) {
    doEverything();
  }

  public static double[] doEverything() {
    double len = Double.parseDouble(JOptionPane.showInputDialog("Input Length"));
    double wid = Double.parseDouble(JOptionPane.showInputDialog("Input Width"));
    double area = len * wid;
    System.out.println("Length:\t" + len);
    System.out.println("Width:\t" + wid);
    System.out.println("Area:\t" + area);
    double[] values = {len, wid, area};
    return values;
  }
}
