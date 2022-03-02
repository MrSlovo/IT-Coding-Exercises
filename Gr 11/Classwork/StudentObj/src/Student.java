
public class Student {

  private int birthYear;
  private String idNum;
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public void setTermMark(boolean termMark) {
    this.termMark = termMark;
  }

  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public String getIdNum() {
    return idNum;
  }

  public boolean getTermMark() {
    return termMark;
  }
  private boolean termMark;

  public Student() {
    name = "";
    birthYear = 0;
    idNum = "000000";
    termMark = false;
  }

  public Student(String n, int bY, String id, Boolean tM) {
    name = n;
    birthYear = bY;
    idNum = id;
    termMark = tM;
  }

  public String toString() {
    return "name:\t" + name + "\nbirthYear:\t" + birthYear + "\nidNum:\t" + idNum + "\ntermMark:\t" + termMark;
  }

}
