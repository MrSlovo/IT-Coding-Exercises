import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WriteToFile {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(
        new FileWriter("P:\\Gr 11\\Textbook Activities\\pg45Activity7\\src\\Data.txt"));
    String line = JOptionPane.showInputDialog("Enter stuff");
    while (!line.equalsIgnoreCase("STOP")) {
      outFile.println(line);
      line = JOptionPane.showInputDialog("Enter stuff");
    }
    outFile.close();
  }
}
