public class UseLine {
  public static void main(String[] args) {
    Line ln = new Line();
    ln.draw('-', 9);
    ln.drawVert('|', 2);
    ln.draw('-', 34);
    ln.drawVert('|', 3);
    ln.draw('-', 34);
    ln.drawVert('|', 2);
    ln.draw('-', 9);
  }
}
