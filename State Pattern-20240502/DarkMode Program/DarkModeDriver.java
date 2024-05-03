package state;

public class DarkModeDriver {

	private Mode mode = new LightMode();
	
	public static void main(String[] args)
	{
		new DarkModeDriver().runCode();
	}
	
	public void runCode()
	{
		System.out.println(mode.status());
		mode = mode.toggle();
		System.out.println(mode.status());
		mode = mode.toggle();		
		System.out.println(mode.status());
		mode = mode.toggle();		
	}
}
