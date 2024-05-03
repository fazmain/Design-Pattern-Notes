package state;

public class ReturnedUncashedCheck extends Check{

  public ReturnedUncashedCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("This is no longer a valid check");
  }

  public void sign() {
    System.out.println("This is no longer a valid check");
  }

  public void endorse(){
    System.out.println("This is no longer a valid check");
  }

  public void cash(){
    System.out.println("Cannot cash an unsigned check");
  }

  public void stopPayment(){
    System.out.println("This is no longer a valid check");
  }
}