
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankApp {

  public static void main(String[] args) {
    try {
      Scanner scFile = new Scanner(new File("Savings.txt"));
      while (scFile.hasNext()) {
        Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
        String clientName = scLine.next();
        System.out.println(clientName);
        String accCode = scLine.next();
        System.out.println(accCode);
        String IDNo = scLine.next();
        System.out.println(IDNo);
        Double balance = scLine.nextDouble();
        if (scLine.hasNext()) {
          Double interest = scLine.nextDouble();
          SavingsAccount savingsAccount = new SavingsAccount(clientName, accCode, IDNo, balance, interest);
          savingsAccount.toString();
        } else {
          BankAccount bankAccount = new BankAccount(clientName, accCode, IDNo, balance);
          bankAccount.toString();
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e);
    }
  }
}
