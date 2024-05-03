package command;

public class Player
{
	Command options[];

	public Player()
	{
		options = new Command[3];
		options[0] = new Rock();
		options[1] = new Paper();
		options[2] = new Scissors();
	}

	public Command getChoice()
	{
		return options[(int)(Math.random()*3)];
	}
}