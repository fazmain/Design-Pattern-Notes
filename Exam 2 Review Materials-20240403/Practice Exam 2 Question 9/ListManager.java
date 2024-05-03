package PracticeExam2;
import java.util.ArrayList;

public class ListManager extends Vector{

	private ArrayList<Integer>  list = new ArrayList<Integer>();  
	private ListOperation listOp;
	
	public ListManager(SortOperationMaker userGen)
	{
		userGen.bePartner(this);
	}
	
	public void transfer(Target target, Object obj)
	{
		listOp = (ListOperation)obj;
		
		list=(listOp.perform(list));
	}
	
	public void display()
	{
		System.out.println("LIST:");
		
		for (int index=0; index<list.size(); index++)
		{
			System.out.print(""+list.get(index)+" ");
		}
		System.out.println();
	}
	
	public void fillList()
	{
		int size = (((int) Math.random()*25) + 10);
		
		for (int index=0; index<size; index++)
		{
			list.add(Integer.valueOf((int)(Math.random() * 150) - 50 ));
		}
	}
}
