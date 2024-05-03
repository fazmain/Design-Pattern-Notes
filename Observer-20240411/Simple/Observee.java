package observer;

import java.util.ArrayList;

public class Observee {

	private ArrayList<Observer> watchers = new ArrayList<Observer>();
	
	public void notifyObservers()
	{
		for (int index=0; index<watchers.size(); index++)
		{
			watchers.get(index).update(this);
		}
	}
	
	public void somethingHappened()
	{
		notifyObservers();
	}
	
	public void registerObserver(Observer observer)
	{
		watchers.add(observer);
	}
	
	public void removeObserver(Observer observer)
	{
		watchers.remove(observer);
	}
}
