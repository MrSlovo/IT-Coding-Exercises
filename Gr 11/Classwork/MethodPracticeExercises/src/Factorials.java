public class Factorials {
  public static void main(String[] args) {
    int num = (int)(Math.round(Math.random() * 9) + 1);
    System.out.println("num:\t" + num + "\ntotal:\t" + factorial(num));
  }
  public static double factorial(double num, double total) {
    if (num == 0) {
      return total;
    }
    total *= num;
    num--;
    return factorial(num, total);
  }
  public static double factorial(double num) {
    return num > 0 ? factorial(num, 1) : 0;
  }
}
