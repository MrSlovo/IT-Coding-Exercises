import java.util.Arrays;
import java.util.Scanner;

public class FundStats {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   Double[] amounts = new Double[50];
   int cashMoneyBaby = 0, i = 0, smallestNumIdx = 0;
   double inputNum, total = 0;
    do {   
      // Inputs num into array
      inputNum = Double.parseDouble(scan.next());
      amounts[i] = inputNum;
      i++;
      
      // Counts amounts greater than 999
      if (inputNum > 999) {
        cashMoneyBaby++;
      }
      
      // Keeps track of the smallest amount index
      if (inputNum < amounts[smallestNumIdx] && inputNum != -999) {
        smallestNumIdx = i;
      }
      
      // Keeps track of the total
      total += inputNum;
    } while (inputNum != -999);
    
    i--;
    
    // Display array
    System.out.println("The array is: ");
    for (int j = 0; j < i; j++) {
      System.out.print("R" + amounts[j] + "\t");
    }
    System.out.println("");
    
    // Display amount of cash money events
    System.out.println("The Moneyees: " + cashMoneyBaby);
    
    // Displays samllest amount
    System.out.println("The minimum amount is: " + amounts[smallestNumIdx]);
    
//    // Removes smallest amount from total and array
//    total -= amounts[smallestNumIdx];
//    amounts[smallestNumIdx] = amounts[i];
//    i--;   
//    
//    // Display the array with the smallest amount removed
//    for (double num : amounts) {
//      System.out.println(num + ", ");
//    }
//    
//    // Calculates the costs (15% of total)
//    double costs = 0.15 * total;
//    System.out.println("The amount towards cost is: R" + costs);
//    
//    
  }
}
