
import javax.swing.JOptionPane;

public class DoubleArray1 {
  public static void main(String[] args) {
    double[] dArr = new double[10];
    
    // 1.1 Pupulates array with 10 random numbers
    for (int i = 0; i < 10; i++) {
      dArr[i] = (Math.random() * 50.0) + 1;
    }
    
    // 1.2 Displays all array elements
    for (double num : dArr) {
      System.out.print(num + " ");
    }
    
    // 1.3 Displays the elements larger than 26.5
    for (double num : dArr) {
      if (num > 26.5) {
        System.out.println(num + "");
      }
    }
    
    // for (int i = 0; i < dArr.length; i++) {
    //  double num = dArr[i];
  //  }
    
    // 1.4 Calculates the average of all numbers in the array
    double total = 0;
    for (double num : dArr) {
      total += num;
    }
    double average = total / dArr.length;
    
    // 1.5 Calculate the number of nums smaller than the average
    int smallerNums = 0;
    for (double num : dArr) {
      if (num < average) {
        smallerNums++;
      }
    }
    System.out.println("The Average is: " + average);
    System.out.println("Number of numbers below the average: " + smallerNums);
    
  }
}
