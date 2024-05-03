package PracticeExam2;
import java.util.ArrayList;

public class Target {

	private ArrayList<Vector> dataPlatform = new ArrayList<Vector>();
	
	public void transfer(Object obj)
	{
		for (int index=0; index<dataPlatform.size(); index++)
		{
			dataPlatform.get(index).transfer(this, obj);
		}
	}
	
	public void bePartner(Vector vector)
	{
		dataPlatform.add(vector);
	}
	
	public void endPartnership(Vector vector)
	{
		dataPlatform.remove(vector);
	}
}
