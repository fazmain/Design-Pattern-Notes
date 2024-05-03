package state;

public class BlankCheck extends Check{

  public BlankCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    checkInfo = new CheckInfo(payee, date, amount);
    System.out.println("Check has been written");
    Check unsignedCheck = new UnsignedCheck(checkTransaction);
    unsignedCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(unsignedCheck);
  }

  public void sign() {
    System.out.println("It's quite foolish to sign a blank check");
  }

  public void endorse(){
    System.out.println("It is unwise to endorse a blank check");
  }

  public void cash(){
    System.out.println("Cannot cash a blank check");
  }

  public void stopPayment(){
    System.out.println("Cannot stop payment on a blank check");
  }
}