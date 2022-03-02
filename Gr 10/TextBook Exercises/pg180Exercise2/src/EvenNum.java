public class EvenNum {
    public static void main(String[] args) {
        int num = 2;
        int numOnLine = 0;
        while (num <= 500) {
            if (numOnLine == 5) {
                System.out.println("");
                numOnLine = 0;
            }
            System.out.print(num + " ");
            num += 2;
            numOnLine++;
        }
    }
}
