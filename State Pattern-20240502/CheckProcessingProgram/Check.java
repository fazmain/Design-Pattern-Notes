package state;

public abstract class Check {

  protected CheckTransaction checkTransaction;
  protected CheckInfo checkInfo;
  protected final double RETURNFEE = 25.0;
  protected final double STOPPAYMENTFEE = 20.0;

  public Check(CheckTransaction checkTransaction) {
    this.checkTransaction = checkTransaction;
  }

  public void setCheckInfo(CheckInfo checkInfo){
    this.checkInfo = checkInfo;
  }

  public abstract void fillIn(String payee, Date date, double amount);
  public abstract void sign();
  public abstract void endorse();
  public abstract void cash();
  public abstract void stopPayment();

}