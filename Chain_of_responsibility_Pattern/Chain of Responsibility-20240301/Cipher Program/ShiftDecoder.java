package chainOfResponsibility;

public class ShiftDecoder implements CipherHandler {

	private CipherHandler nextCipherHandler;
	private int shiftAmount;
	private char[] decodedText;
	private String decodedString;
	private KeyWordChecker checker;

	public ShiftDecoder(int shiftAmount){
		this.shiftAmount = shiftAmount;
		checker = KeyWordChecker.getChecker();
	}
	
    public void setNextChainLink(CipherHandler next){
		nextCipherHandler = next;
	}
	
    public String decode(String cipherText){
	
		System.out.println("Shift Decoder object ( " + shiftAmount + " ) Received string " + cipherText);
		decodedText = cipherText.toCharArray();
	
		for(int index=0;index<decodedText.length;index++)
		{
			decodedText[index] = (char)((int)(decodedText[index]) + shiftAmount);
			
			// "hacky" way of quickly resolving the wrap-around issue
			while (decodedText[index] < 'a')
			{
				decodedText[index] += 26;
			}
			
			while (decodedText[index] > 'z')
			{
				decodedText[index] -= 26;
			}
			
		}
		decodedString = String.copyValueOf(decodedText, 0, decodedText.length);
	
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
