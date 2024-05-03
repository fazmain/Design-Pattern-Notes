package state;

/* This class will serve as the context for the different
   states that a check might have */

public class CheckTransaction {

  private Check check;
  private CheckingAccount checkingAccount;

  public CheckTransaction(CheckingAccount account) {
    checkingAccount = account;
    check = new BlankCheck(this);
  }

  public void updateTransaction(Check check){
    this.check = check;
  }

  public CheckingAccount getAccount(){
    return checkingAccount;
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("ATTEMPTING TO FILL IN A CHECK");
    check.fillIn(payee, date, amount);
  }

  public void sign() {
    System.out.println("ATTEMPTING TO SIGN A CHECK");
    check.sign();
  }

  public void endorse(){
    System.out.println("ATTEMPTING TO ENDORSE A CHECK");
    check.endorse();
  }

  public void cash(){
    System.out.println("ATTEMPTING TO CASH A CHECK");
    check.cash();
  }

  public void stopPayment(){
    System.out.println("ATTEMPTING TO STOP PAYMENT ON A CHECK");
    check.stopPayment();
  }
}