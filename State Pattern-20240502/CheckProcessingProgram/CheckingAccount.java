package state;

public class CheckingAccount {

  private double balance;

  public CheckingAccount(double amount) {
    balance = amount;
  }

  public double getBalance() {
    return balance;
  }

  public double withdrawel(double amount){
    if (balance >= amount) {
      balance = balance - amount;
    }
    return amount;
  }
}