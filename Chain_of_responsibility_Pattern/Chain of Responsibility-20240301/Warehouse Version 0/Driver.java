package chainOfCommand;

/*
 *  This program simulates a collection of Warehouses that need goods
 *  transferred between them.  The are 3 types of transfers:
 *  Urgent that takes place immediately, Normal that buffers
 *  three transfers before executing, and Bulk which buffers all day and
 *  are resolved at the end.
 * 
 *  This is the original version of the Warehouse program.
 *  It has only one class, and, although it is fully functional, it
 *  uses several "design" techniques that make it difficult to modify
 *  and extend:
 *   a.) Hardcoded values interwoven throughout the code
 *   b.) Conditional statements that would need updating in multiple locations
 *   c.) No encapsulation whatsoever
 *   
 *   For the in-class exercise, you are asked to refactor this program to
 *   introduce design patterns to reduce these problems.
 *   
 *   1.) Refactor the Command pattern into the program to encapsulate the transfers
 *   2.) Refactor the Chain of Responsibility into program with the Command to
 *       generically handle each type of transfer request
 *       
 */   

public class Driver {

	private int[] inventory = {1000, 1000, 1000, 1000};
	private int[] normSource = {0,0,0,0}, normDest= {0,0,0,0}, normUnits= {0,0,0,0}, deltaWH= {0,0,0,0};
	private int sourceWH, destWH, units, priority, normCount=0;
	private String[] labels = {"URGENT", "NORMAL", "BULK"};

	public static void main(String[] args)
	{
		new Driver().runCode();
	}

	public void runCode()
	{
		int transferSize;

		displayWarehouses();
		for (int count=0; count<7; count++)
		{
			sourceWH = (int)(Math.random()*4);
			destWH = (int)(Math.random()*4);

			while (destWH == sourceWH)
			{
				destWH = (int)(Math.random()*4);
			}
			priority = (int)(Math.random()*3);

			if (priority == 0)
			{
				transferSize = 200;
			}
			else if (priority == 1)
			{
				transferSize = 50;
			}
			else
			{
				transferSize = 10;
			}
			units = (int)(Math.random()*transferSize)+(transferSize/2);

			System.out.println("Transferring "+units+" units from Warehouse "+(char)(sourceWH+'A')+" to warehouse "+(char)(destWH+'A')+" at "+labels[priority]+" priority");

			if (priority == 0) //urgent
			{
				inventory[sourceWH] -= units;
				inventory[destWH] += units;
			}
			else if (priority == 1) // normal
			{
				System.out.println("Buffering NORMAL transfer: "+normCount);
				normSource[normCount] = sourceWH;
				normDest[normCount] = destWH;
				normUnits[normCount] = units;
				normCount++;
				if (normCount == 3)
				{
					System.out.println("Performing 3 buffered NORMAL transfers");
					for (int index=0; index<3; index++)
					{
						System.out.println("Transferring "+normUnits[index]+" units from Warehouse "+(char)(normSource[index]+'A')+" to warehouse "+(char)(normDest[index]+'A'));
						inventory[normSource[index]] -= normUnits[index];
						inventory[normDest[index]] += normUnits[index];
					}
					normCount = 0;
				}
			}
			else if (priority == 2)
			{
				System.out.println("Prepping BULK transfer");
				deltaWH[sourceWH] -= units;
				deltaWH[destWH] += units;
			}
			displayWarehouses();
		}
		if (normCount != 0)
		{
			System.out.println("Performing "+normCount+" buffered NORMAL transfers");
			for (int index=0; index<normCount; index++)
			{
				System.out.println("Transferring "+normUnits[index]+" units from Warehouse "+(char)(normSource[index]+'A')+" to warehouse "+(char)(normDest[index]+'A'));
				inventory[normSource[index]] -= normUnits[index];
				inventory[normDest[index]] += normUnits[index];
			}			
		}
		System.out.println("Executing BULK transfer");
		for (int index=0; index<4; index++)
		{
			System.out.println("Warehouse "+(char)(index+'A')+" inventory changes by "+deltaWH[index]+" units");
			inventory[index] += deltaWH[index];
		}
		displayWarehouses();
	}

	public void displayWarehouses()
	{
		System.out.println("Warehouse A: "+inventory[0]+" units");
		System.out.println("Warehouse B: "+inventory[1]+" units");
		System.out.println("Warehouse C: "+inventory[2]+" units");
		System.out.println("Warehouse D: "+inventory[3]+" units");
		System.out.println();	
	}
}
