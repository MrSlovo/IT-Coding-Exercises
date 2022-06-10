public class SpoiltVotes extends Votes {
  private int spoilt;

  public SpoiltVotes(int spoilt, String wardID, String districtID, int total, int resultA, int resultB) {
    super(wardID, districtID, total, resultA, resultB);
    this.spoilt = spoilt;
  }

  public int calcSpoiltA() {
    int percentage = Math.round((super.getResultA() - spoilt) / super.getTotal() * 100);
    return percentage;
  }

  public int calcSpoiltB() {
    int percentage = Math.round((super.getResultB() - spoilt) / super.getTotal() * 100);
    return percentage;
  }

  @Override
  public String toString() {
    return "wardID: " + getWardID() + "\tdistrictID: " + getDistrictID() + "\ttotal: " + getTotal() + "\tresultA: "
        + getResultA() + "\tresultB: " + getResultB() + "\tspoilt: " + spoilt;
  }

}
