package observer;

public abstract class Observer {
	
	private int num=0;
	
	public abstract void update(Observee doer, Object obj);
	
	public abstract void update(Observee doer);
}
