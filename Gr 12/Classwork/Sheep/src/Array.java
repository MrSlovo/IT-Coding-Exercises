
import java.io.File;
import java.util.Scanner;

public class Array {

  public static void main(String[] args) {
    Sheep[] sheepArr = new Sheep[50];
    int size = 0;

    try {
      Scanner scFile = new Scanner(new File("P:/Gr 12/Classwork/Sheep/src/data.txt"));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.next()).useDelimiter("#");
        String cut = scLine.next();
        System.out.println(cut);
        Boolean freeRange = scLine.next().equalsIgnoreCase("true");
        System.out.println(freeRange);
        Double price = Double.parseDouble(scFile.next());
        System.out.println(price);
        int mass = scFile.nextInt();
        System.out.println(mass);
       
        sheepArr[size] = new Sheep(cut, freeRange, price, mass);
        size++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
