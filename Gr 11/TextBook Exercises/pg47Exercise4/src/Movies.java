import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Movies {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(
        new FileWriter("P:\\Gr 11\\TextBook Exercises\\pg47Exercise4\\src\\Movie.txt"), true);
    String movie = JOptionPane.showInputDialog("Enter stuff");
    while (!movie.equalsIgnoreCase("STOP")) {
      outFile.println(movie);
      movie = JOptionPane.showInputDialog("Enter stuff");
    }
    outFile.close();
  }
}
