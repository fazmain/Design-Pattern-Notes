package state;

public class CheckInfo {

  private String payee;
  private Date date;
  private double amount;

  public CheckInfo(String payee, Date date, double amount)
  {
    this.payee = payee;
    this.date = date;
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}