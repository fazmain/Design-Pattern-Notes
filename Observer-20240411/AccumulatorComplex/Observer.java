package observer;

public abstract class Observer {
	
	private int num=0;
	
	public void update(Observee doer, Object obj) {};
	
	public void update(Observee doer) {};
	

}
