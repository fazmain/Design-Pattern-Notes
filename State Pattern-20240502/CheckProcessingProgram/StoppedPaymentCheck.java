package state;

public class StoppedPaymentCheck extends Check{

  public StoppedPaymentCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("Payment on this check has been stopped, it cannot be changed");
  }

  public void sign() {
    System.out.println("Payment on this check has been stopped");
  }

  public void endorse(){
    System.out.println("Payment on this check has been stopped, it cannot be endorsed");
  }

  public void cash(){
    System.out.println("Payment on this check has been stopped, in cannot be cashed");
  }

  public void stopPayment(){
    System.out.println("Payment of this check has already been stopped");
  }
}