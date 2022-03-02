
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CompAccs {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    inputData();
    outputData();
  }

  private static void inputData() throws IOException {
    PrintWriter outFile = new PrintWriter(
      new FileWriter("P:\\Gr 11\\TextBook Exercises\\pg47Exercise4\\src\\Acronyms.txt"), true);
    String acronyms = JOptionPane.showInputDialog("Enter Accronyms");
    while (!acronyms.equalsIgnoreCase("STOP")) {
      outFile.println(acronyms);
      acronyms = JOptionPane.showInputDialog("Enter Accronyms");
    }
    outFile.close();
  }

  private static void outputData() throws FileNotFoundException {
    Scanner scFile = new Scanner(new File("P:\\Gr 11\\TextBook Exercises\\pg47Exercise4\\src\\Acronyms.txt"))
      .useDelimiter("#");
    while (scFile.hasNextLine()) {
      Scanner scan = new Scanner(scFile.nextLine()).useDelimiter("#");
      String inputAcronym = scan.next();
      String inputMeaning = scan.next();
      System.out.println("" + inputAcronym + "\t" + inputMeaning);
      scan.close();
    }
    scFile.close();
  }
}
