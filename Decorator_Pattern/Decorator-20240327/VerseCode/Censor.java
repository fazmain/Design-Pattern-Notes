package decorator;

public class Censor extends VerseDecorator{

	private boolean clean;

	public Censor(Verse comp, boolean status) {
		component = comp;
		clean = status;
	}

	public void display(){
		if (!clean)
		{
			System.out.println("<dirty>");  
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("XX Get your mind out of the gutter XX");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}
		else
		{
			System.out.println("<clean>");
			component.display();
		}
	}
}