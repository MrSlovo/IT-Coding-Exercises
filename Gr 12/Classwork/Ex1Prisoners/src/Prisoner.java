public class Prisoner {
  private String name;
  private int months;
  private char block;

  public Prisoner(String n, int m, char b) {
    this.name = n;
    this.months = m;
    this.block = b;
  }

  public String getName() {
    return name;
  }

  public int getMonths() {
    return months;
  }

  public char getBlock() {
    return block;
  }

  @Override
  public String toString() {
    return getBlock() + "\t" + getName() + "\t(" + getMonths() + ")";
  }
}
