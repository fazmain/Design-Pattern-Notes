
public class Driver {

	public static void main(String[] args)
	{
		new Driver().runCode(20); // change this number to generate the first n prime numbers.
	}

	public void runCode(int num)
	{
		int count = 0;
		int candidate = 2;
		Sieve sieve = new Sieve(candidate);

		System.out.println("Printing the first "+ num + " prime numbers:");
		candidate++;
		while(count < num)
		{
			if (sieve.checkNum(candidate))
			{
				count++;
			}
			candidate++;
		}
	sieve.display();
	}
}
