
public class Sheep {

  private String cut;
  private Boolean freeRange;
  protected double price;
  private int mass;
  final public static String COUNTRY = "SA";

  public Sheep(String c, Boolean f, double p, int m) {
    cut = c;
    freeRange = f;
    price = p;
    mass = m;
  }

  private double calcVat() {
    return price * 1.15;
  }

  public void setCut(String c) {
    cut = c;
  }

  public void setFreeRange(Boolean f) {
    freeRange = f;
  }

  public void setPrice(double p) {
    price = p;
  }

  public void setMass(int m) {
    mass = m;
  }

  public static String getCountry() {
    return COUNTRY;
  }

  public String getCut() {
    return cut;
  }

  public Boolean getFreeRange() {
    return freeRange;
  }

  public double getPrice() {
    return price;
  }

  public int getMass() {
    return mass;
  }

  public String toString() {
    return "cut=" + cut + ", freeRange=" + freeRange + ", price=" + price + ", mass=" + mass;
  }

}
