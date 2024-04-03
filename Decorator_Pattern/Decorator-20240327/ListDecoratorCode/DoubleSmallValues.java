package decorator;

public class DoubleSmallValues extends ListDecorator {

	public DoubleSmallValues(IntegerList iList)
	{
		System.out.println("Doubling Small Values");
		list = new int[iList.getLength()];
		
		for (int index=0; index<list.length; index++)
		{
			if (iList.getValue(index) < 50 && iList.getValue(index) > -50)
			{
				list[index] = iList.getValue(index)*2;
			}
			else
			{
				list[index] = iList.getValue(index);
			}
		}
	}
}
