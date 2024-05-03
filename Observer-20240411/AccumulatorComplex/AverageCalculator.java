package observer;

public class AverageCalculator extends Observer
{
    int val, numVals = 0;
    float total, average;

    public AverageCalculator(NumberMaker nm)
    {
    	total = 0;
    	nm.registerObserver(this);
    }

    public void update(Observee o, Object obj)
    {
    	val = ((Integer)obj).intValue();
    	total = total + val;
    	numVals++;
    	average = total / numVals;
    	System.out.println("AVERAGE: " + average);
    }
}
