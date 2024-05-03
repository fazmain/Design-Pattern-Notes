package observer;

public class Accumulator extends Observer
{
    private int val, total = 0;
    private boolean pushPull = true; // true for push, false for pull

    public Accumulator(NumberMaker nm)
    {
    	nm.registerObserver(this);
    }

    public void update(Observee o, Object obj)
    {
    	if (!pushPull) return; 
    	val = ((Integer)obj).intValue();
    	total = total + val;

    	System.out.println("ACCUMULATOR: (push):" + total);
    }
    
    public void update(Observee o)
    {
    	if (pushPull) return;
    	val = o.getNum();
    	total = total + val;
    	
    	System.out.println("ACCUMULATOR: (pull): " + total);
    }
    
    public void setPush()
    {
    	pushPull = true;
    }
    
    public void setPull()
    {
    	pushPull = false;
    }
}
