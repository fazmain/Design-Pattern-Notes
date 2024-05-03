package observer;

public class Driver
{
	private NumberMaker numMaker;
	private Accumulator accumulator;

	public static void main(String args[])
	{
		new Driver().runCode();
	}

	public void runCode()
	{
		numMaker = new NumberMaker();
		accumulator = new Accumulator(numMaker);
		numMaker.genNumbers();
	}
}
