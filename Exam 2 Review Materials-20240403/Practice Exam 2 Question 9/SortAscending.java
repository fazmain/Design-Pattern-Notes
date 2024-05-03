package PracticeExam2;
import java.util.ArrayList;

public class SortAscending extends ListOperation {

	public ArrayList<Integer> perform(ArrayList<Integer> list)
	{
		
		int temp, small, smallPos;
		System.out.println("\nSort Ascending:");

		for (int index=0; index < list.size()-1; index++)
		{
			small = list.get(index);
			smallPos = index;
			for (int pos=index; pos<list.size(); pos++)
			{
				if (list.get(pos) < small)
				{
					small = list.get(pos);
					smallPos = pos;
				}
			}
			temp = list.get(smallPos);
			list.set(smallPos, list.get(index));
			list.set(index, temp);
		}
		return list;
	}
}
