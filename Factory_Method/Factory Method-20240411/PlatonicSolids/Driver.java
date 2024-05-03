/*
 * Simple example of the Factory Method design pattern
 * 
 * Driver does not know what kind of a Solid is created,
 * yet still performs operations on it
 * 
 * Author: D. Palmer	Date: April 12, 2021
 */

public class Driver {

	private SolidGenerator solidGenerator;
	private Solid solid;
	
	public static void main(String[] args)
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		solidGenerator = new SolidGenerator();
		for (int platonicSolid=0; platonicSolid<5; platonicSolid++)
		{
			// getSolid is the factory method
			solid = solidGenerator.getSolid(platonicSolid);
			solid.display();
			System.out.println();
		}
	}
}
