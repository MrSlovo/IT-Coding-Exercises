public class EvenNums2 {
    public static void main(String[] args) {
        int numOnLine = 0;
        for (int num = 2; num <= 500; num += 2) {
            if (numOnLine == 5) {
                System.out.println("");
                numOnLine = 0;
            }
            System.out.print(num + " ");
            numOnLine++;
        }
    }
   
}
    
