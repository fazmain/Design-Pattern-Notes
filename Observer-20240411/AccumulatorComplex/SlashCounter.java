package observer;

public class SlashCounter extends Observer
{
    int val;

    public SlashCounter(NumberMaker nm)
    {
    	nm.registerObserver(this);
    }

    public void update(Observee o, Object obj)
    {
    	val = ((Integer)obj).intValue();

    	if (val > 5 && val < 25)
    	{
    		System.out.print("SLASHMARKER: ");

    		for (int count=0; count < val; count++)
    		{
    			System.out.print("| ");
    		}
    		System.out.println();
    	}
    }
}
