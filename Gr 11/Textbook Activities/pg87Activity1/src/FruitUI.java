
public class FruitUI {

  public static void main(String[] args) {
    Fruit apples = new Fruit("apples", 10, 0.70);
    System.out.println(apples);
    System.out.println("Total Quantity: " + Fruit.totalQty + ", Amount Spent: " + Fruit.totalCost);
    System.out.println("");

    Fruit bananas = new Fruit("bananas", 20, 0.50);
    System.out.println(bananas);
    System.out.println("Total Quantity: " + Fruit.totalQty + ", Amount Spent: " + Fruit.totalCost);
    System.out.println("");

    Fruit oranges = new Fruit("oranges", 15, 0.80);
    System.out.println(oranges);
    System.out.println("Total Quantity: " + Fruit.totalQty + ", Amount Spent: " + Fruit.totalCost);
    System.out.println("");
  }
}
