package PracticeExam2;

public class SortOperationMaker extends Target{
	
	private ListOperation listOp;
	
	public void makeListSorter()
	{
		listOp = new SortAscending();
		transfer(listOp);
	}

}
