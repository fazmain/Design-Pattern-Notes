package templateMethod;

/*
 * This is a simple implementation of a London-based vacation cost calculator
 * There are three different types of London-based vacations, the cost for each
 * one is calculated by a different method that is customized for that vacation.
 * 
 * Author: D. Palmer	Date: 2-23-2021 (extracted from an earlier version)
 * 
 * Modified: D. Palmer Date: 2/20/2024
 */

public class VacationCalculatorNoPattern
{
	// There are three possibilities for this trip:                                                                                  
	// 1. Spend the entire week in London, England                                                                                   
	// 2. Spend 2 days in London, 2 in Paris, 2 days in Rome                                                                         
	// 3. Spend the week bicycling through the English countryside                                                                   

	public int costOfLondonSightsVacation()
	{
		int transportationCost, lodgingCost, additionalCost, totalCost;

		System.out.println("Congratulations on picking a London-based vacation!");
		System.out.println("You have selected the LONDON SIGHTS VACATION\n");

		System.out.println("UNIVERSAL COST: round-trip airfare from Cleveland to London is $1200\n");
		transportationCost = 1200; // roundtrip airfare from Cleveland to London                                                     

		System.out.println("ADDITIONAL CUSTOM TRAVEL COSTS:");

		System.out.println("This has a $200 city transportation budget");
		System.out.println("Including taxis, double-decker busses, and underground\n");

		additionalCost = 200; // local taxi, bus and underground costs                                                           

		transportationCost += additionalCost;
		System.out.println("UNIVERSAL COST: include $245 for the arrival night in a London hotel\n");
		lodgingCost = 245; // one night in the London airport hotel                                                                  

		System.out.println("ADDITIONAL CUSTOM LODGING COSTS:");        
		System.out.println("Six more nights in the London hotel: $1350");
		additionalCost = 1350; // Option 1: 6 more nights in London hotel                                                          

		lodgingCost += additionalCost;
		totalCost = transportationCost + lodgingCost;

		return totalCost;
	}

	public int costOfEuropeanCitiesVacation()
	{
		int transportationCost, lodgingCost, additionalCost, totalCost;

		System.out.println("Congratulations on picking a London-based vacation!");

		System.out.println("You have selected the EUROPEAN CITIES VACATION\n");

		System.out.println("UNIVERSAL COST: round-trip airfare from Cleveland to London is $1200\n");
		transportationCost = 1200; // roundtrip airfare from Cleveland to London                                                     

		System.out.println("ADDITIONAL CUSTOM TRAVEL COSTS:");

		System.out.println("This has a $140 Chunnel train ride to Paris\n");
		additionalCost = 140; // train to Paris

		System.out.println("and a $350 flight to Rome from Paris");
		additionalCost += 350; // flight to Rome 
		System.out.println("and a $420 flight from Rome back to London");
		additionalCost += 420; // flight from Rome back to London                                                                
		transportationCost += additionalCost;
		System.out.println("UNIVERSAL COST: include $245 for the arrival night in a London hotel\n");
		lodgingCost = 245; // one night in the London airport hotel                                                                  

		System.out.println("ADDITIONAL CUSTOM LODGING COSTS:");        

		System.out.println("Two additional nights in London: $375");
		additionalCost = 375; // two nights in London  
		System.out.println("Two nights in Paris: $750");
		additionalCost += 750; // two nights in Paris 
		System.out.println("Two nights in Rome: $420");
		additionalCost += 420; // two nights in Rome                                                                             

		lodgingCost += additionalCost;
		totalCost = transportationCost + lodgingCost;

		return totalCost;
	}

	public int costOfEnglishCountrysideBikingVacation()
	{
		int transportationCost, lodgingCost, additionalCost, totalCost;

		System.out.println("Congratulations on picking a London-based vacation!");
		System.out.println("You have selected the ENGLISH COUNTRYSIDE BIKING VACATION\n");

		System.out.println("UNIVERSAL COST: round-trip airfare from Cleveland to London is $1200\n");
		transportationCost = 1200; // roundtrip airfare from Cleveland to London                                                     

		System.out.println("ADDITIONAL CUSTOM TRAVEL COSTS:");

		System.out.println("This has a $150 to rent a bicycle for a week\n");
		additionalCost = 150; // renting a bicycle for a week                                                                    
		transportationCost += additionalCost;
		System.out.println("UNIVERSAL COST: include $245 for the arrival night in a London hotel\n");
		lodgingCost = 245; // one night in the London airport hotel                                                                  

		System.out.println("ADDITIONAL CUSTOM LODGING COSTS:");        
		System.out.println("Six nights of youth hostel fees: $120");
		additionalCost = 120; // Option 3: six nights of campground fees                                                                   

		lodgingCost += additionalCost;
		totalCost = transportationCost + lodgingCost;

		return totalCost;
	}

	public static void main(String args[])
	{
		VacationCalculatorNoPattern vc1 = new VacationCalculatorNoPattern();
		
		System.out.println("Comparison of prices of three London-based vacation packages:\n");
		System.out.println("##################################################################\n");
		System.out.println("Total cost: $"+vc1.costOfLondonSightsVacation());
		System.out.println("##################################################################\n");
		System.out.println("Total cost: $"+vc1.costOfEuropeanCitiesVacation());
		System.out.println("##################################################################\n");
		System.out.println("Total cost: $"+vc1.costOfEnglishCountrysideBikingVacation());
		System.out.println("##################################################################\n");
	}
}
