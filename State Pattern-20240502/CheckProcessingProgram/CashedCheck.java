package state;

public class CashedCheck extends Check{

  public CashedCheck(CheckTransaction checkTransaction) {
    super(checkTransaction);
  }

  public void fillIn(String payee, Date date, double amount){
    System.out.println("Check has already been cashed, cannot change info");
  }

  public void sign() {
    System.out.println("Check has already been cashed");
  }

  public void endorse(){
    System.out.println("Check has already been endorsed and cashed");
  }

  public void cash(){
    System.out.println("Check has already been cashed, cannot use again");
  }

  public void stopPayment(){
    System.out.println("This check has already been cashed, too late to stop payment");
  }
}