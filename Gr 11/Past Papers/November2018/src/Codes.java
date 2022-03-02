
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Codes {

  public static void main(String[] args) throws FileNotFoundException {
    String[] nameArr = new String[20];
    String[] checkArr = new String[20];
    int size = 0;
    try {
      Scanner scFile = new Scanner(new File("codes.txt"));
      while (scFile.hasNext()) {
        String ln = scFile.nextLine();
        System.out.print(ln);
        Scanner scLine = new Scanner(ln).useDelimiter("#");
        nameArr[size] = scLine.next();
        checkArr[size] = scLine.next();
        size++;
      }
    } catch (FileNotFoundException error) {
      System.err.println("Goddamit. File not found");
    }
    System.out.println("sorting");
    for (int i = 0; i <= size - 1; i++) {
      for (int j = i + 1; j <= size; j++) {
        if (nameArr[i].compareTo(nameArr[j]) > 0) {
          String tempName = nameArr[i];
          nameArr[i] = nameArr[j];
          nameArr[j] = tempName;
          String tempCheck = checkArr[i];
          checkArr[i] = checkArr[j];
          checkArr[j] = tempCheck;
        }
      }
    }
    for (int i = 0; i <= size; i++) {
      System.out.println(nameArr[i] + "\t" + checkArr[i]);
    }
    int count = 0;
    System.out.println("Girls with Allergies");
    for (int i = 0; i <= size; i++) {
      if (nameArr[i].charAt(nameArr[i].length() - 1) == 'F'
        && checkArr[i].charAt(checkArr[i].length() - 1) == '*') {
        System.out.println(nameArr[i] + "\t" + checkArr[i]);
        count++;
      }
    }
    System.out.println("Total girls with allergies: " + count);
  }
}
