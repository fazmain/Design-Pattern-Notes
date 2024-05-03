package observer;

import java.time.Duration;
import java.time.Instant;

public class VerificationNumber extends Observer {

	private Instant start,end;
	private Duration timeElapsed;
	private int val;
	
    public VerificationNumber(NumberMaker nm)
    {
    	nm.registerObserver(this);
    }

	
    public void update(Observee o)
    {
    	if (start == null)
    	{
    		val = o.getNum();
    		System.out.println("Setting new verification number: "+val);
    		start = Instant.now();
    	}
    	else
    	{
    		end = Instant.now();
    		timeElapsed = Duration.between(start, end);
    		if (timeElapsed.toMillis() > 5)
    		{
    			start = end;
    			val = o.getNum();
    			System.out.println("5 milliseconds are up, access number expired");
    			System.out.println("Setting new access number: "+ val);
    		}
    		else
    		{
    			System.out.println("Previous access code: "+ val+" still valid");
    		}
    	}
    	System.out.println();
    }
}
