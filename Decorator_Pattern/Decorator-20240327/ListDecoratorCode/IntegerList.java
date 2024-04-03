package decorator;

public abstract class IntegerList {

	protected int[] list;
	
	public void display()
	{
		for (int index=0; index<list.length; index++)
		{
			int num = list[index];
			
			if (num < -10)
			{
				System.out.print(" "+num);
			}
			else if (num < 0)
			{
				System.out.print("  "+num);
			}
			else if (num < 10)
			{
				System.out.print("   "+num);
			}
			else 
			{
				System.out.print("  "+num);
			}
		}
		System.out.println("\n");
	}
	
	public int getLength()
	{
		return list.length;
	}
	
	public int getValue(int index)
	{
		return list[index];
	}
}
