package state;

public class StateCheckTester {

  public static void main(String args[]) {
    StateCheckTester tester = new StateCheckTester();
    tester.doTests();
  }

  public void doTests() {
    Date date = new Date(1,24,2024);
    CheckingAccount account = new CheckingAccount(363.38);// forces 1 bad check
    CheckTransaction check1 = new CheckTransaction(account);
    CheckTransaction check2 = new CheckTransaction(account);
    CheckTransaction check3 = new CheckTransaction(account);
    check1.endorse();
    check2.cash();
    check2.stopPayment();
    check1.fillIn("SpongeBob", date, 200.25);
    check1.fillIn("Scooby Doo", date, 15.24);
    check1.endorse();
    check1.cash();
    check2.fillIn("Homer Simpson", date, 343.34);
    check2.sign();
    check2.sign();
    check2.endorse();
    check1.sign();
    check1.endorse();
    check1.endorse();
    check1.stopPayment();
    check1.sign();
    check1.endorse();
    check1.fillIn("Spiderman", date, 192.23);
    check1.cash();
    check2.cash();
    check2.stopPayment();
    check3.fillIn("Barbie", date, 1.19);
    check3.sign();
    check3.endorse();
    check3.cash();
    check3.fillIn("Ted Lasso", date, 19.99);
    check3.sign();
    check3.endorse();
    check3.cash();
    check3.stopPayment();
  }
}
