
public class StringToolsNS {

  private String str;

  public StringToolsNS(String str) {
    this.str = str;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public int countWords() {
    String temp = " " + str;
    int numOfWords = 0;
    char prev, curr;
    for (int i = 0; i < temp.length(); i++) {
      prev = temp.charAt(i);
      curr = temp.charAt(i + 1);
      if ((Character.isLetter(prev) || Character.isDigit(prev)) == false && (Character.isLetter(curr) || Character.isDigit(curr)) == true) {
        numOfWords++;
      }
    }
    return numOfWords;
  }

  public void firstCaps() {
    String temp = " " + str;
    temp = temp.toLowerCase();
    String newStr = "";
    char prev, curr;
    for (int i = 0; i < temp.length(); i++) {
      prev = temp.charAt(i);
      curr = temp.charAt(i + 1);
      if (Character.isLetter(prev) == false && Character.isLetter(curr) == true) {
        newStr = newStr + Character.toUpperCase(curr);
      } else {
        newStr = newStr + curr;
      }
      str = newStr;
    }
  }

  public String toString() {
    return "The value of the string is: \"" + str + "\"";
  }
}
