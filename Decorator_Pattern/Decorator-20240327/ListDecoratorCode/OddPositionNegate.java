package decorator;

public class OddPositionNegate extends ListDecorator {

	public OddPositionNegate(IntegerList iList)
	{
		System.out.println("Negating Values in Odd Positions");
		list = new int[iList.getLength()];
		
		for (int index=0; index<list.length; index++)
		{
			if (index % 2 == 1)
			{
			   list[index] = -1* iList.getValue(index);
			}
			else
			{
				list[index] = iList.getValue(index);
			}
		}
	}
}
