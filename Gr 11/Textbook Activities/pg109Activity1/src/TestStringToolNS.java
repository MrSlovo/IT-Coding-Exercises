
public class TestStringToolNS {

  public static void main(String[] args) {
    StringToolsNS stngTls = new StringToolsNS("Some String Value");
    System.out.println(stngTls);
    
    int num = stngTls.countWords();
    System.out.println("The number of words is: " + num);
  }
}
