public class Equipment {
  private int deliveryID;
  private String name;
  private int quantity;

  public Equipment(int id, String n, int q) {
    this.deliveryID = id;
    this.name = n;
    this.quantity = q;
  }

  public int getID() {
    return deliveryID;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return " " + "*" + " " + quantity + " " + "x" + " " + name;
  }
  
}
