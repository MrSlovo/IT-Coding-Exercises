public class RandomIntArray {
   public static void main(String[] args) {
      int[] numArr = new int[15];
      for (int i = 0; i < numArr.length; i++) {
         int randNum = (int) Math.round(Math.random() * 100.0) + 1;
         numArr[i] = randNum;
      }
   }
}
