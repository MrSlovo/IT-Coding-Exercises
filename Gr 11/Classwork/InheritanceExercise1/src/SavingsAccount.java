
public class SavingsAccount extends BankAccount {

  private Double interestRate;

  public SavingsAccount(String owner, String accCode, String IDNo, Double balance, Double interestRate) {
    super(owner, accCode, IDNo, balance);
    this.interestRate = interestRate;
  }

  @Override
  public String toString() {
    return getOwner() + "\t" + getAccCode() + "\t" + getIDNo() + "\t" + getBalance() + "\t" + interestRate;
  }
}
