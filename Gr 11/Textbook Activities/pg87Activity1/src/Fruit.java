
public class Fruit {

  private String description;
  private int qty;
  private double costPrice;
  private double sellingPrice;

  public static final int MARKUP = 75;

  public Fruit(String d, int q, double c) {
    description = d;
    qty = q;
    costPrice = c;
    sellingPrice = costPrice + costPrice * MARKUP / 100.0;
    totalQty += qty;
    totalCost = totalCost + costPrice * qty;
  }
  
  public static int totalQty;
  public static double totalCost;

  public String toString() {
    return "Fruit Name: " + description + ", Quantity: " + qty + ", Cost Price: " + costPrice + ", Selling Price: " + sellingPrice;
  }
  
  
}
