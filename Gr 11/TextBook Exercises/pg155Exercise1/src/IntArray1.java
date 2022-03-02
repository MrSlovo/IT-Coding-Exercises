public class IntArray1 {
  public static void main(String[] args) {
    // Declare an array of integers
    int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8};
    
    System.out.println("Array Contents: ");
    // Output the elements of the array
    for (int i = 0; i < intArr.length; i++) {
      System.out.print(intArr[i] + " ");
    }
    
    // Adds a blank line
    System.out.println("\n");
    
    System.out.println("Array Contents Doubled: ");
    // Doubles all elements
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = intArr[i] * 2;
      System.out.print(intArr[i] + " ");
    }
    
    // Adds a blank line
    System.out.println("\n");
        
    System.out.println("Array Contents With Every Second Element Squared: ");
    // Squares every 2nd element
    for (int i = 0; i < intArr.length; i++) {
      if (i % 2 == 0) {
        intArr[i] = (int) Math.pow(intArr[i], 2);
      }
      System.out.print(intArr[i] + " ");
    }
    
    // Adds a blank line
    System.out.println("\n");
    
    System.out.println("Array Contents in Reverse Order: ");
    // Outputs elements of array in reverse order
    for (int i = intArr.length - 1; i >= 0; i--) {
      System.out.print(intArr[i] + " ");
    }
  }
}
