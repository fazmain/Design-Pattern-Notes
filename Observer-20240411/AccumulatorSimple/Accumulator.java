package observer;

public class Accumulator extends Observer
{
    int val, total = 0;

    public Accumulator(NumberMaker nm)
    {
    	nm.registerObserver(this);
    }

    public void update(Observee o, Object obj)
    {
    	val = ((Integer)obj).intValue();
    	total = total + val;

    	System.out.println("ACCUMULATOR: (push)" + total);
    }
    
    public void update(Observee o)
    {
    	val = o.getNum();
    	total = total + val;
    	
    	System.out.println("ACCUMULATOR: (pull): " + total);
    }
}
