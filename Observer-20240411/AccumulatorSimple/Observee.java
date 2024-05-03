package observer;

import java.util.ArrayList;

public class Observee {

	private ArrayList<Observer> watchers = new ArrayList<Observer>();
	
	public void notifyObservers(Observee observee, Object obj)
	{
		for (int index=0; index<watchers.size(); index++)
		{
			watchers.get(index).update(observee, obj);
		}
	}
	
	public void notifyObservers(Observee observee)
	{
		for (int index=0; index<watchers.size(); index++)
		{
			watchers.get(index).update(observee);
		}
	}
	
	public void registerObserver(Observer observer)
	{
		watchers.add(observer);
	}
	
	public void removeObserver(Observer observer)
	{
		watchers.remove(observer);
	}
	
	public int getNum()
	{
		return 0;
	}
}
