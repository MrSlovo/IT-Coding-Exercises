
import java.io.File;
import java.util.Scanner;

public class SheepArr {

  private Sheep[] sheepArr = new Sheep[50];
  private int size = 0;

  public SheepArr() {
    try {
      Scanner scFile = new Scanner(new File("P:/Gr 12/Classwork/Sheep/src/data.txt"));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.next()).useDelimiter("#");
        String cut = scLine.next();
        Boolean freeRange = scLine.next().equalsIgnoreCase("true");
        Double price = scFile.nextDouble();
        int mass = scFile.nextInt();

        sheepArr[size] = new Sheep(cut, freeRange, price, mass);
        size++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
