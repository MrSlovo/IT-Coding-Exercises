public class BankAccount {

  private String owner;
  private String accCode;
  private String IDNo;
  private Double balance;

  public BankAccount(String owner, String accCode, String IDNo, Double balance) {
    this.owner = owner;
    this.accCode = accCode;
    this.IDNo = IDNo;
    this.balance = balance;
  }

  public String getOwner() {
    return owner;
  }

  public String getAccCode() {
    return accCode;
  }

  public String getIDNo() {
    return IDNo;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String toString() {
    return owner + "\t" + accCode + "\t" + IDNo + "\t" + balance;
  }

}
