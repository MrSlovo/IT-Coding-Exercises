
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeleveriesManager {
  private Delivery[] delivery = new Delivery[100];
  private int size = 0;

  public DeleveriesManager() {
    try {
      Scanner scFile = new Scanner(new File("delivery.txt"));
      while (scFile.hasNextLine()) {
        Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(";");
        delivery[size] = new Delivery(scLine.nextInt(), scLine.nextInt(), scLine.nextInt(), LocalDate.parse(scLine.next(), DateTimeFormatter.ofPattern("yyyy/mm/dd")), scLine.nextInt(), scLine.next().charAt(0));
        size++;
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
  
  
}
