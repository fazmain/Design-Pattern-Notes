package command;

public class Driver {
	private Player p1, p2;
	private int p1Result, p2Result, p1WinCount=0, p2WinCount=0;
	private Command p1Choice, p2Choice;

	public static void main(String args[])
	{
		new Driver().play();
	}

	public void play()
	{
		p1 = new Player();
		p2 = new Player();

		for (int i = 0;i<20;i++)
		{
			p1Choice = p1.getChoice();
			p2Choice = p2.getChoice();

			// <delay>
			
			System.out.print("Player 1: ");
			p1Result = p1Choice.execute();
			System.out.print("Player 2: ");	
			p2Result = p2Choice.execute();

			if (p1Result == p2Result)
			{
				System.out.println("TIE");
			}
			else if (((p1Result+1) % 3) == p2Result)
			{
				System.out.println("WINNER:       Player 1");
				p1WinCount++;
			}
			else 
			{
				System.out.println("WINNER:       Player 2");
				p2WinCount++;
			}
			System.out.println("Player1: "+p1WinCount +" Player2: "+p2WinCount+"\n");
		}
		System.out.println("Player 1 wins: " + p1WinCount);
		System.out.println("Player 2 wins: " + p2WinCount);
	}
}		