package state;

public class EndorsedCheck extends Check{

  public EndorsedCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("Check has already been written and endorsed");
  }

  public void sign() {
    System.out.println("Check has already been signed and endorsed");
  }

  public void endorse(){
    System.out.println("It is unwise to endorse and unsigned check");
  }

  public void cash(){
    double balance = (checkTransaction.getAccount()).getBalance();
    if (balance >= checkInfo.getAmount()){
       Check cashedCheck = new CashedCheck(checkTransaction);
       cashedCheck.setCheckInfo(checkInfo);
       checkTransaction.updateTransaction(cashedCheck);
       (checkTransaction.getAccount()).withdrawel(checkInfo.getAmount());
    }
    else {
       System.out.println("There are insufficient funds to cash this check");
       Check badCheck = new InsufficientFundsCheck(checkTransaction);
       badCheck.setCheckInfo(checkInfo);
       checkTransaction.updateTransaction(badCheck);
    }
  }

  public void stopPayment(){
    System.out.println("Payment of this check has been stopped");
    Check stoppedPaymentCheck = new StoppedPaymentCheck(checkTransaction);
    stoppedPaymentCheck.setCheckInfo(checkInfo);
    checkTransaction.updateTransaction(stoppedPaymentCheck);
    (checkTransaction.getAccount()).withdrawel(STOPPAYMENTFEE);
  }
}