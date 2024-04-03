package decorator;

public class RemoveDups extends ListDecorator {

	public RemoveDups(IntegerList iList)
	{
		int[] tempList = new int[iList.getLength()];
		int tempIndex = 1;
		boolean repeat = false;
		
		System.out.println("Removing Duplicates");
		tempList[0] = iList.getValue(0);

		for (int count=1; count<iList.getLength(); count++)
		{
			for (int index=0; index<tempIndex; index++)
			{
				if (iList.getValue(count) == tempList[index])
				{
					repeat = true;
				}
			}
			if (!repeat)
			{
				tempList[tempIndex++] = iList.getValue(count);
			}
			repeat = false;
		}
		list = new int[tempIndex];
		
		for(int index=0; index<tempIndex; index++)
		{
			list[index] = tempList[index];
		}
	}
}
