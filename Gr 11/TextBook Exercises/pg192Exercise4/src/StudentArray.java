
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class StudentArray {

  private String[] names = new String[5];

  public String[] getNames() {
    return names;
  }
  private int[] test1 = new int[5];
  private int[] test2 = new int[5];
  private int[] test3 = new int[5];
  private double [] testAverage = new double[5];
  private int size = 0;

  public StudentArray() {
    try {
      Scanner scFile = new Scanner(new File("students.txt"));
      while (scFile.hasNext()) {
        Scanner scan = new Scanner(scFile.next()).useDelimiter("#");
        names[size] = scan.next();
        test1[size] = scan.nextInt();
        test2[size] = scan.nextInt();
        test3[size] = scan.nextInt();
        testAverage[size] = (test1[size] + test2[size] + test3[size]) / 3;
        size++;
      }
    } catch (Exception e) {
      System.out.println("Damn. Unlucky");
    }
  }

  public void sortArrays() {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (names[i].compareTo(names[j]) > 0) {
          String tempName = names[i];
          names[i] = names[j];
          names[j] = tempName;
          int tempTest1 = test1[i];
          test1[i] = test1[j];
          test1[j] = tempTest1;
          int tempTest2 = test2[i];
          test2[i] = test2[j];
          test2[j] = tempTest2;
          int tempTest3 = test3[i];
          test3[i] = test3[j];
          test3[j] = tempTest3;
        }
      }
    }
  }

  public double getTestAverage(int index) {
    return testAverage[index];
  }  
  

  public String toString() {
    return "Student Names: \t" + Arrays.toString(names) + "\nTest 1 Marks: \t" + Arrays.toString(test1) + "\nTest 2 Marks: \t" + Arrays.toString(test2) + "\nTest 3 Marks: \t" + Arrays.toString(test3) + "\nTest Averages: \t" + Arrays.toString(testAverage) ;
  }

}
