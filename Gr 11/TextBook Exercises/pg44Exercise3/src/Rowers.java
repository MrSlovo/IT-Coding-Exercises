
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rowers {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner scFile = new Scanner(new File("P:\\Gr 11\\TextBook Exercises\\pg44Exercise3\\src\\Rowing.txt")).useDelimiter("#");
    while (scFile.hasNextLine()) {
      Scanner scan = new Scanner(scFile.nextLine()).useDelimiter("#");
      int age = scan.nextInt();
      String fullname = scan.next();
      String comp = scan.next();
      int num = scan.nextInt();
      System.out.println("" + age + "\t" + fullname + "\t" + comp + "\t" + num);
      scan.close();
    }
    scFile.close();
  }
}
