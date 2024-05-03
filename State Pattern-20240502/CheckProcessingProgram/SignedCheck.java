package state;

public class SignedCheck extends Check{

  public SignedCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
      System.out.println("Check has already been written and signed");
  }

  public void sign() {
    System.out.println("Check has already been signed");
  }

  public void endorse(){
    System.out.println("Check has now been endorsed");
    Check endorsedCheck = new EndorsedCheck(checkTransaction);
    endorsedCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(endorsedCheck);
  }

  public void cash(){
    System.out.println("A check must be endorsed before it can be cashed");
  }

  public void stopPayment(){
    System.out.println("Payment of this check has been stopped");
    Check stoppedPaymentCheck = new StoppedPaymentCheck(checkTransaction);
    stoppedPaymentCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(stoppedPaymentCheck);
  }
}