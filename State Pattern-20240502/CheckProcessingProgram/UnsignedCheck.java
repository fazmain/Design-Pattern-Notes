package state;

public class UnsignedCheck extends Check{

  public UnsignedCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("Check information has already been entered");
  }

  public void sign() {
    Check signedCheck = new SignedCheck(checkTransaction);
    signedCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(signedCheck);
  }

  public void endorse(){
    System.out.println("It is unwise to endorse and unsigned check");
  }

  public void cash(){
    System.out.println("Cannot cash an unsigned check");
  }

  public void stopPayment(){
    System.out.println("Payment of this check has been stopped");
    Check stoppedPaymentCheck = new StoppedPaymentCheck(checkTransaction);
    stoppedPaymentCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(stoppedPaymentCheck);
  }
}