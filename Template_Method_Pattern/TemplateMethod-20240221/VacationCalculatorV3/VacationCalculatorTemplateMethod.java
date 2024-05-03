package templateMethod;
/*
 * This is reimplementation of the London-based vacation cost calculator program
 * using the Template Method pattern. The common aspects are in the template
 * method in the abstract class. 
 * 
 * There are three different types of London-based vacations, the cost for each
 * one is calculated by a single method that is customized by calling abstract
 * methods that have been implemented in the subclasses. 
 * 
 * 
 * Author: D. Palmer	Date: 2-23-2021 (extracted from an earlier version)
 * 
 * Modified: D. Palmer Date: 2-20-2024
 * 
 */

public abstract class VacationCalculatorTemplateMethod
{
	// There are three possibilities for this trip:                                                                                  
	// 1. Spend the entire week in London, England                                                                                   
	// 2. Spend 2 days in London, 2 in Paris, 2 days in Rome                                                                         
	// 3. Spend the week bicycling through the English countryside                                                                   

	public final int costOfLondonVacation()
	{
		int transportationCost, lodgingCost, additionalCost, totalCost;
		System.out.println("Congratulations on picking a London-based vacation!");
		System.out.println("You have selected the " + this.getLondonVacationName()+"\n");
		
		System.out.println("UNIVERSAL COST: round-trip airfare from Cleveland to London is $1200\n");
		transportationCost = 1200; // roundtrip airfare from Cleveland to London                                                     

		System.out.println("ADDITIONAL CUSTOM TRAVEL COSTS:");
		additionalCost = calculateLocalTransportation();

		transportationCost += additionalCost;
		System.out.println("UNIVERSAL COST: include $245 for the arrival night in a London hotel\n");
		lodgingCost = 245; // one night in the London airport hotel                                                                  

		System.out.println("ADDITIONAL CUSTOM LODGING COSTS:");        
		additionalCost = calculateExtraLodging();

		lodgingCost += additionalCost;
		totalCost = transportationCost + lodgingCost;

		return totalCost;
	}

	public abstract String getLondonVacationName();
	public abstract int calculateLocalTransportation();
	public abstract int calculateExtraLodging();

	public static void main(String args[])
	{
		LondonSightsVacationCalculator vc3a = new LondonSightsVacationCalculator();
		EuropeanCitiesVacationCalculator vc3b = new EuropeanCitiesVacationCalculator();
		EnglishCountrysideBikingVacationCalculator vc3c = new EnglishCountrysideBikingVacationCalculator();
		System.out.println("Comparison of prices of three London-based vacation packages:\n");
		System.out.println("##################################################################\n");

		System.out.println("$" + vc3a.costOfLondonVacation());
		System.out.println("##################################################################\n");

		System.out.println("$" + vc3b.costOfLondonVacation());
		System.out.println("##################################################################\n");

		System.out.println("$" + vc3c.costOfLondonVacation());
		System.out.println("##################################################################\n");

	}
}
