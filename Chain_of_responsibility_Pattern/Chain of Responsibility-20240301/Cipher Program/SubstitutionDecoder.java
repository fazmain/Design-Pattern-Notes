package chainOfResponsibility;

public class SubstitutionDecoder implements CipherHandler {

	private CipherHandler nextCipherHandler;
	private int shiftAmount;
	private char[] decodedText, subs;
	private String decodedString;
	private KeyWordChecker checker;

	public SubstitutionDecoder(char substitutionArray[]){
		checker = KeyWordChecker.getChecker();
		subs = substitutionArray;
	}
	
    public void setNextChainLink(CipherHandler next){
		nextCipherHandler = next;
	}
	
    public String decode(String cipherText){
    	
    	String string = new String(subs);
		System.out.println("Substitution Decoder object ( " + string + " ) Received string " + cipherText);
		decodedText = cipherText.toCharArray();
	
		for(int index=0;index<decodedText.length;index++)
		{
			decodedText[index] = subs[(decodedText[index]) - 'a'];
			decodedString = String.copyValueOf(decodedText, 0, decodedText.length);
		}
	
		if ( isCodeCracked(decodedString) )
		{
			System.out.println(decodedString);
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
