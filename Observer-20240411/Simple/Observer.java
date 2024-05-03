package observer;

public class Observer {
	
	private int num;
	
	public Observer(int num)
	{
		this.num = num;
	}

	public void update(Observee doer)
	{
		System.out.println("Observer: " + num+ " knows something happened");
	}
}
