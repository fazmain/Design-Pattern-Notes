package observer;

public class Driver
{
	private static Driver init;
	private NumberMaker numMaker;
	private Accumulator accumulatorPush;
	private Accumulator accumulatorPull;
	private NamePrinter namePrinter;
	private AverageCalculator aveCalculator;
	private SlashCounter slashCounter;
	private VerificationNumber vNum;


	public static void main(String args[])
	{
		new Driver().runCode();
	}

	public void runCode()
	{
		numMaker = new NumberMaker();
		accumulatorPush = new Accumulator(numMaker);
		accumulatorPush.setPush();
		accumulatorPull = new Accumulator(numMaker);
		accumulatorPull.setPull();
		namePrinter = new NamePrinter(numMaker);
		aveCalculator = new AverageCalculator(numMaker);
		slashCounter = new SlashCounter(numMaker);
		vNum = new VerificationNumber(numMaker);
		
		numMaker.genNumbers();

	}
}
