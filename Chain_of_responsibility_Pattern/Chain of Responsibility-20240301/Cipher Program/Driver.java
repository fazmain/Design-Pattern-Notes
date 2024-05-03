package chainOfResponsibility;

public class Driver {

	private CipherHandler priorityIndigo, priorityJade, priorityPurple, priorityRed, priorityOrange, priorityGreen, priorityBlue, priorityViolet;
	private CipherHandler startDecode;
	
	private char letterList[];
	
	public static void main(String args[])
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
								   //abcdefghijklmnopqrstuvwxyz
		String substitutionString = "werqbzyxkjionmlpdcutsvahgf";
	
		letterList = substitutionString.toCharArray();
		
		priorityPurple = new ReverseAndShiftByOne(1);
		priorityViolet = new ReverseAndShiftByOne(-1);
		priorityJade = new ReverseAndSubstitute(letterList);
		priorityIndigo = new SubstituteNTimes(letterList, 5);
		priorityRed = new ShiftDecoder(1);
		priorityOrange = new ShiftDecoder(-1);
		priorityGreen = new ShiftDecoder(13);
		priorityBlue = new SubstitutionDecoder(letterList);
	        //priorityViolet = new Reverse();
		
		priorityPurple.setNextChainLink(priorityViolet);
		priorityViolet.setNextChainLink(priorityJade);
		priorityJade.setNextChainLink(priorityIndigo);
		priorityIndigo.setNextChainLink(priorityRed);
		priorityRed.setNextChainLink(priorityOrange);
		priorityOrange.setNextChainLink(priorityGreen);
		priorityGreen.setNextChainLink(priorityBlue);
		//priorityBlue.setNextChainLink(priorityViolet);
		
		startDecode = priorityPurple;

//		System.out.println("==================================================");
//		System.out.println("DECODING: dcb");		
//		startDecode.decode("dcb");
//
//		System.out.println("==================================================");
//		System.out.println("DECODING: baz");		
//		startDecode.decode("baz");
//
//		System.out.println("==================================================");
//		System.out.println("DECODING: rew");		
//		startDecode.decode("rew");
//		
//		System.out.println("==================================================");
//		System.out.println("DECODING: wer");		
//		startDecode.decode("wer");
		
		
		System.out.println("==================================================");
		System.out.println("DECODING: IFMMP");		
		startDecode.decode("ifmmp");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("DECODING: GDKKN");	
		startDecode.decode("gdkkn");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("DECODING: BYYRU");	
		startDecode.decode("byyru");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("DECODING: XBOOL");	
		startDecode.decode("xbool");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("DECODING: OLLEH");	
		startDecode.decode("olleh");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("DECODING: PMMFI");	
		startDecode.decode("pmmfi");
		System.out.println("==================================================");

	}
	

}
