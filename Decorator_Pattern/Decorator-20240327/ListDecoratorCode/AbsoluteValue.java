package decorator;

public class AbsoluteValue extends ListDecorator {

	public AbsoluteValue(IntegerList iList)
	{
		System.out.println("Taking Absolute Value");
		list = new int[iList.getLength()];
		
		for (int index=0; index<list.length; index++)
		{
			list[index] = Math.abs(iList.getValue(index));
		}
	}
}
