public class SpoiltVotes extends Votes {
  private int spoilt;

  public SpoiltVotes(int spoilt, String wardID, String districtID, int total, int resultA, int resultB) {
    super(wardID, districtID, total, resultA, resultB);
    this.spoilt = spoilt;
  }
  
  public calcSpoiltA() {
    
  }

  @Override
  public String toString() {
    return "wardID: " + getWardID() + "\tdistrictID: " + getDistrictID() + "\ttotal: " + getTotal() + "\tresultA: " + getResultA() + "\tresultB: " + getResultB() + "\tspoilt: " + spoilt;
  }
  
}
