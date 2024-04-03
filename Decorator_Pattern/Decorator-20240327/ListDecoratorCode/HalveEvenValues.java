package decorator;

public class HalveEvenValues extends ListDecorator {

	public HalveEvenValues(IntegerList iList)
	{
		System.out.println("Halving Even Values");
		list = new int[iList.getLength()];
		
		for (int index=0; index<list.length; index++)
		{
			int num = iList.getValue(index);
			if (num % 2 == 0)
			{
				list[index] = num / 2;
			}
			else
			{
				list[index] = num;
			}
		}
	}
	
}
