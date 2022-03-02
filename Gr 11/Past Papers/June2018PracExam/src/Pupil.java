public class Pupil {
  private String name;
  private int grade;
  private boolean canDoFirstAid;
  private int rating;

  public Pupil() {
    this.name = "John Doe";
    this.grade = 12;
    this.canDoFirstAid = false;
    this.rating = 10;
  }

  public Pupil(String name, int grade, boolean canDoFirstAid, int rating) {
    this.name = name;
    this.grade = grade;
    this.canDoFirstAid = canDoFirstAid;
    this.rating = rating;
  }

  public int calcBasicRate() {
    int basicRate;
    if (this.rating > 10 || this.rating < 0) {
      return 0;
    }
    basicRate = this.rating > 5 ? 30 : 20;
    basicRate += this.canDoFirstAid ? 10 : 0;
    return basicRate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public boolean isCanDoFirstAid() {
    return this.canDoFirstAid;
  }

  public boolean getCanDoFirstAid() {
    return this.canDoFirstAid;
  }

  public void setCanDoFirstAid(boolean canDoFirstAid) {
    this.canDoFirstAid = canDoFirstAid;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String toString() {
    return "Pupil Name: \t" + this.name + "\n" + "Grade: \t \t" + this.grade + "\n" + "Rating: \t \t" + this.rating
        + "\n" + "First Aid: \t" + this.canDoFirstAid + "\n" + "Basic Rate: \t" + this.calcBasicRate();
  }
}
