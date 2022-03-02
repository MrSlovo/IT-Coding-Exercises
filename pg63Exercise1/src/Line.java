public class Line {
  public void draw(char pattern, int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(pattern);
    }
    System.out.println("");
  }

  public void drawVert(char pattern, int size) {
    for (int i = 0; i < size; i++) {
      System.out.println(pattern);
    }
  }
}
