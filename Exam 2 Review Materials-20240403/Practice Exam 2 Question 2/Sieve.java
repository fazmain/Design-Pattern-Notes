
public class Sieve {

	private int num;
	private Sieve alternate = null;
	
	public Sieve(int num)
	{
		this.num = num;
	}
	public boolean checkNum(int candidate)
	{
		if ((candidate%num) == 0)
		{
			return false;
		}
		
		if (alternate == null)
		{
			alternate = new Sieve(candidate);
			return true;
		}
		else
		{
			return alternate.checkNum(candidate);
		}
	}
	
	public void display()
	{
		System.out.print(num+" ");
		if (alternate != null) alternate.display();
	}
}
