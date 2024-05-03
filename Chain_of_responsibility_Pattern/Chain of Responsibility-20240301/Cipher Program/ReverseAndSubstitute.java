package chainOfResponsibility;

public class ReverseAndSubstitute implements CipherHandler{

	private CipherHandler nextCipherHandler;
	private int shiftAmount;
	private char[] decodedText, subs;
	private String decodedString;
	private KeyWordChecker checker;

	public ReverseAndSubstitute(char substitutionArray[]){
		checker = KeyWordChecker.getChecker();
		subs = substitutionArray;
	}
	
    public void setNextChainLink(CipherHandler next){
		nextCipherHandler = next;
	}
	
    public String decode(String cipherText){
	
    	String reverse = "";
		for(int i=cipherText.length()-1; i>=0; i--) {
			reverse += cipherText.charAt(i);
		}
		
		String string = new String(subs);
		System.out.println("Substitution Decoder object ( " + string + " ) Received string " + cipherText);
		decodedText = reverse.toCharArray();
	
		for(int index=0;index<decodedText.length;index++)
		{
			decodedText[index] = subs[(decodedText[index]) - 'a'];
			decodedString = String.copyValueOf(decodedText, 0, decodedText.length);
		}
	
		if ( isCodeCracked(decodedString) )
		{
			System.out.println(decodedString);
			System.out.println("reverse and substitute");
			return decodedString;
		}
		else
		{
			if (nextCipherHandler != null)
			{
			   return nextCipherHandler.decode(cipherText);
			}
			else 
			{
				System.out.println("Cannot decode the string " + cipherText);
				return cipherText;
			}
		}
	}
	
	public boolean isCodeCracked(String candidateText){
		return checker.findKeyWords(candidateText);
	}

}
