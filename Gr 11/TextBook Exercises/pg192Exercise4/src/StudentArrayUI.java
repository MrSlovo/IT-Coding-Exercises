
public class StudentArrayUI {

  public static void main(String[] args) {
    StudentArray class1 = new StudentArray();
    System.out.println(class1.toString());
    class1.sortArrays();
    System.out.println(class1.toString());
    for (int i = 0; i < 5; i++) {
      System.out.println("" + class1.getNames()[i] + ": " + class1.getTestAverage(i));
    }
  }
}
