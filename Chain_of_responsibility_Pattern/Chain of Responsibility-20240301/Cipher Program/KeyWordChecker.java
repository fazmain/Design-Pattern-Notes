package chainOfResponsibility;

public class KeyWordChecker {

	private KeyWordChecker()
	{
	}

	public static KeyWordChecker getChecker()
	{
		return new KeyWordChecker();
	}
	
	// In a realistic version of this program, there would be a complete library
	// of terms to search for with a statistical evaluator threshold to determine
	// whether the code had been cracked.  Since the goal here is design patterns
	// not cryptography, we'll go with this.
	public boolean findKeyWords(String text)
	{
		System.out.println("Checking the string: " + text);
		if (text.equals("hello") )
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
