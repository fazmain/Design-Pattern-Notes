package observer;

public class NamePrinter extends Observer
{

    int val;
    String[] numNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public NamePrinter(NumberMaker nm)
    {
    	nm.registerObserver(this);
    }

    public void update(Observee observee)
    {
	   val = observee.getNum();
	   if (val>= 0 && val <= 9)
	   {
	      System.out.println("NAMEPRINTER: " + numNames[val]);
	   }
    }
}
