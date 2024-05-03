package chainOfResponsibility;

public class ReverseAndShiftByOne implements CipherHandler{

	private CipherHandler nextCipherHandler;
	private int shiftAmount;
	private KeyWordChecker checker;
	private char[] decodedText;
	private String decodedString;

	public ReverseAndShiftByOne(int i) {
		
		shiftAmount = i;
		checker = KeyWordChecker.getChecker();
		
	}
	
	@Override
	public void setNextChainLink(CipherHandler next) {

		nextCipherHandler = next;
		
	}

	@Override
	public String decode(String cipherText) {
		
		String reverse = "";
		for(int i=cipherText.length()-1; i>=0; i--) {
			reverse += cipherText.charAt(i);
		}
		
//		String reverse = "";
//		for(int i=cipherText.length()-1; i>=0; i--) {
//			reverse += cipherText.charAt(i);
//		}
		
		System.out.println("Shift Decoder object ( " + shiftAmount + " ) Received string " + cipherText);
		decodedText = reverse.toCharArray();
	
		for(int index=0;index<decodedText.length;index++)
		{
			decodedText[index] = (char)((int)(decodedText[index]) + shiftAmount);
			
			// "hacky" way of quickly resolving the wrap-around issue
			if (decodedText[index] < 'a')
			{
				decodedText[index] += 26;
			}
			
			if (decodedText[index] > 'z')
			{
				decodedText[index] -= 26;
			}
			
		}
		decodedString = String.copyValueOf(decodedText, 0, decodedText.length);
	
		if ( isCodeCracked(decodedString) )
		{
			System.out.println(decodedString);
			System.out.println("reverse and shift");
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

	@Override
	public boolean isCodeCracked(String candidateText) {
		
		return checker.findKeyWords(candidateText);
		
	}

	
}
