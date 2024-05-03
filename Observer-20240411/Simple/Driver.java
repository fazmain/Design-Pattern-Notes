package observer;

public class Driver {

	Observer watcher1 = new Observer(0);
	Observer watcher2 = new Observer(1);
	Observer watcher3 = new Observer(2);
	
	Observee doer = new Observee();
	
	public static void main(String[] args)
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		doer.registerObserver(watcher1);
		doer.somethingHappened();
		System.out.println();
		
		doer.registerObserver(watcher2);
		doer.somethingHappened();
		System.out.println();
		
		doer.registerObserver(watcher3);
		doer.somethingHappened(); 
		System.out.println();
		
		doer.removeObserver(watcher2);
		doer.somethingHappened(); 
		System.out.println();		
	}
}
