public class IronMan {
  private int suitID;
  private String suitName;
  private int health;
  private int power;

  public IronMan() {
    this.suitID = 1;
    this.suitName = "Mark I";
    this.health = 0;
    this.power = 0;
  }

  public IronMan(int suitID, String suitName, int health, int power) {
    this.suitID = suitID;
    this.suitName = suitName;
    this.health = health;
    this.power = power;
  }

  public String toString() {
    return this.suitID + "#" + this.suitName + "\t" + this.health + "\t" + this.power + "\t" + calcPoints();
  }

  public int calcPoints() {
    double points = Math.sqrt((10 * (this.health + this.power) / 2));
    return (int) Math.round(points);
  }

  public int getSuitID() {
    return this.suitID;
  }

  public void setSuitID(int suitID) {
    this.suitID = suitID;
  }

  public String getSuitName() {
    return this.suitName;
  }

  public void setSuitName(String suitName) {
    this.suitName = suitName;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getPower() {
    return this.power;
  }

  public void setPower(int power) {
    this.power = power;
  }

}