package templateMethod;

/*
 * Customized costs for the English Countryside Biking option of the Vacation
 * 
 * Author: D. Palmer Date: 2-23-2021 (updated from an earlier version)
 */

public class EnglishCountrysideBikingVacationCalculator extends VacationCalculatorTemplateMethod
{
	public String getLondonVacationName()
	{
		return "ENGLISH COUNTRYSIDE BIKING VACATION";
	}

	public int calculateLocalTransportation()
	{
		System.out.println("This has a $150 to rent a bicycle for a week\n");
		return 150;  // renting a bike for a week
	}

	public int calculateExtraLodging()
	{
		System.out.println("Six nights of youth hostel fees: $120");
		return 6 * 20; // 6 nights of hosteling
	}
}