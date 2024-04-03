package decorator;

/*
 * This is an incomplete driver program for the homework 5, task 3. To complete this 
 * task you must use the Decorator pattern to implement a list manipulation program.
 * 
 * Start by creating an IntegerList class that can be initialized with an integer array.
 * 
 * Then create new decorator classes to "decorate" the lists with specific actions as
 * described below.
 * 
 * You must also create any additional classes necessary to support the structure and
 * actions of the Decorator pattern. The decorations for this program are more complex
 * than the ones we discussed in class, but they are of the same structure.
 * 
 * Look at the Coordinate program for guidance with these decorators.
 * 
 * Author: D. Palmer	Date: 2-19-2021		
 * 
 * Modified by: D. Palmer Date: 2-19-2024
 * 
 */

public class Driver {

	 private IntegerList listA, listB, listC;
	
	private int[] list = {55, 24, -76, 55, 59, -82, 9, -24, 41, 19, -48, -3, 76, -18, 63, 19};
	
	public static void main(String[] args)
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		listA = new DoubleDigitList(list);
		System.out.println("Displaying Original List");
		listA.display();
		listB = new DoubleSmallValues(listA);  	// values < 50 or > -50 are doubled
		listB.display();
		listB = new RemoveDups(listB);		   	// any duplicates of a number in the list are removed
		listB.display();
		listB = new AbsoluteValue(listB);		// all negative values are made positive	
		listB.display();
		listB = new HalveEvenValues(listB);// even values > 50 or < -50 are halved
		listB.display();
		listB = new RemoveDups(listB);			// see above
		listB.display();
		listB = new OddPositionNegate(listB);	// values in odd locations of the list are negated
		listB.display();
		listB = new DoubleSmallValues(listB);
		listB = new DoubleSmallValues(listB);
		listB = new DoubleSmallValues(listB);
		listB = new AbsoluteValue(listB);
		listB = new RemoveDups(listB);
		listB.display();
		System.out.println("Displaying Original List");
		listA.display();
		listC = new OddPositionNegate(listA);
		listC.display();
		listC = new RemoveDups(listC);
		listC.display();
		listC = new HalveEvenValues(listC);
		listC = new HalveEvenValues(listC);
		listC = new HalveEvenValues(listC);
		listC = new HalveEvenValues(listC);
		listC.display();
		listC = new AbsoluteValue(listC);
		listC.display();
		listC = new RemoveDups(listC);
		listC.display();
	}
}
