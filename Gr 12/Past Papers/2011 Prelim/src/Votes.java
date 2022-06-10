public class Votes {
  private int wardID;
  private String districtID;
  private int total;
  private int resultA;
  private int resultB;

  public Votes(String wardID, String districtID, int total, int resultA, int resultB) {
    setWardID(wardID);
    this.districtID = districtID;
    this.total = total;
    this.resultA = resultA;
    this.resultB = resultB;
  }

  public void setWardID(String wardID) {
    int num = Integer.parseInt(wardID.substring(wardID.length() - 3));
    this.wardID = num;
  }
  
  public int calcA() {
    int voteShare = Math.round((resultA) / total * 100);
    return voteShare;
  }
  
  public int calcB() {
    int voteShare = Math.round((resultB) / total * 100);
    return voteShare;
  }

  public int getWardID() {
    return wardID;
  }

  public String getDistrictID() {
    return districtID;
  }

  public int getTotal() {
    return total;
  }

  public int getResultA() {
    return resultA;
  }

  public int getResultB() {
    return resultB;
  }
  
  @Override
  public String toString() {
    return "wardID: " + wardID + "\tdistrictID: " + districtID + "\ttotal: " + total + "\tresultA: " + resultA + "\tresultB: " + resultB;
  }
  
}
