public class RandArr {
  public static void main(String[] args) {
    int[] numArr = new int[5];
    int numStorage;
     
    // Populates array with rand ints in range 5 - 17
    for (int i = 0; i < numArr.length; i++) {
      int randNum = (int) Math.round(Math.random() * 13) + 4;
      numArr[i] = randNum;
    }
    
    // Displays array elements
    for (int num : numArr) {
      System.out.print(num + " ");
    }
     
    // Sort Aray
    for (int i = 0; i < numArr.length; i++) {     
      for (int j = i + 1; j < numArr.length; j++) {
        if (numArr[i] > numArr[j]) {
          numStorage = numArr[j];
          numArr[j] = numArr[i];
          numArr[i] = numStorage;
        }
      }
    }
    
    System.out.println("");
    // Displays sorted arr
    for (int num : numArr) {
      System.out.print(num + " ");
    }
  }
}
