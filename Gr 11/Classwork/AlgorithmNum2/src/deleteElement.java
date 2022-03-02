
import java.util.Arrays;
import javax.swing.JOptionPane;

public class deleteElement {
public static void main(String[] args) {
  
    int[] arr = { 3, 5, 6, 7, 0 };
    int target = Integer.parseInt(JOptionPane.showInputDialog("Enter number to delete"));
    int targetIdx = -1;
    
    // Find the index of the target. Return -1 if target is not found
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        targetIdx = i;
        break;
      }
    }
    
    for (int i = targetIdx; i < arr.length - 1; i++) {
      arr[i] = arr[i+1];
    }
    
//    for (int num : arr) {
//      System.out.print(num + " ");
//    }

    System.out.println(Arrays.toString(arr));
  }
}
