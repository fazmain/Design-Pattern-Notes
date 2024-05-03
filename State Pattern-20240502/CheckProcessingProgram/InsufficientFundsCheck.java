package state;

public class InsufficientFundsCheck extends Check{

  public InsufficientFundsCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("Check has already been denied, cannot change info");
  }

  public void sign() {
    System.out.println("Check has already been signed and denied");
  }

  public void endorse(){
    System.out.println("Check has already been endorsed and payment denied");
  }

  public void cash(){
      double balance = (checkTransaction.getAccount()).getBalance();
    if (balance >= checkInfo.getAmount() + RETURNFEE){
       Check cashedCheck = new CashedCheck(checkTransaction);
       cashedCheck.setCheckInfo(checkInfo);
       checkTransaction.updateTransaction(cashedCheck);
       (checkTransaction.getAccount()).withdrawel(checkInfo.getAmount() + RETURNFEE);

    }
    else {
       System.out.println("There are STILL insufficient funds to cash this check");
       Check voidCheck = new ReturnedUncashedCheck(checkTransaction);
       voidCheck.setCheckInfo(checkInfo);
       checkTransaction.updateTransaction(voidCheck);
    }
  }

  public void stopPayment(){
    System.out.println("This check was denied due to insufficient funds");
    System.out.println("Payment has now been stopped");
    Check stoppedPaymentCheck = new StoppedPaymentCheck(checkTransaction);
    stoppedPaymentCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(stoppedPaymentCheck);
  }
}