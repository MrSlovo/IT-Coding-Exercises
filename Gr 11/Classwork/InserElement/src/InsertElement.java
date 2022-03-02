
import java.util.Arrays;
import javax.swing.JOptionPane;

public class InsertElement {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int num = Integer.parseInt(JOptionPane.showInputDialog("Enter The Number You Wish To Insert"));
    int idx = Integer.parseInt(JOptionPane.showInputDialog("Enter The Index You Wish To Insert It In"));
    int temp;
    
    for (int i = arr.length - 1; i > idx; i--) {
      arr[i] = arr[i - 1];
    }
    arr[idx] = num;


    System.out.println(Arrays.toString(arr));
    
  }
}
