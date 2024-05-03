package command;

public class Scissors extends Command
{
	public int execute()
	{
		System.out.println("SCISSORS");
		return 1;
	}
}