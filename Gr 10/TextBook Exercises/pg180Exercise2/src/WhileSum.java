public class WhileSum {
    public static void main(String[] args) {
        int step = 1;
        int num = 0;
        int numOfPositiveInt = 0;
        while (num <= 5000) {
            num += step;
            step++;
            numOfPositiveInt++;
        }
        System.out.println(numOfPositiveInt);
    }
}
