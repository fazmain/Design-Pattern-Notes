package observer;

public class NumberMaker extends Observee
{
	int generatedNumber;

	public void genNumbers()
	{

		System.out.println("BEGIN:...");
		for (int count=0;count<8;count++)
		{
			generatedNumber = (int)(Math.random() * 20);
			System.out.println("Number Maker made a new number: " +generatedNumber);

			notifyObservers(this, Integer.valueOf(generatedNumber));
			//notifyObservers(this);
			System.out.println();
		}

		System.out.println("COMPLETE:...");
	}
	
	public int getNum()
	{
		return generatedNumber;
	}
}
