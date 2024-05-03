package PracticeExam2;

/*
 *  
 *  Author: D. Palmer 		Date: March 24, 2021 to remove deprecated code
 *  
 *  Modified: April 1, 2024 Update code for CS 399 practice exam
 */

public class Driver {
	
	private SortOperationMaker userSort = new SortOperationMaker();
	private ListManager list = new ListManager(userSort);
	
	public static void main(String args[])
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		list.fillList();       			// fill the list with values
		list.display();        			// display the list
		
		userSort.makeListSorter();  	// sort the list in ascending order
		list.display();		   			// display the list again
	}
}
