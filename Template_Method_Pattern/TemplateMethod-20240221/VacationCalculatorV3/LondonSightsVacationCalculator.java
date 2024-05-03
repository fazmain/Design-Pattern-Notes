package templateMethod;

/*
 * Customized costs for the London Sights option of the Vacation
 * 
 * Author: D. Palmer Date: 2-23-2021 (updated from an earlier version)
 */

public class LondonSightsVacationCalculator extends VacationCalculatorTemplateMethod
{
	public String getLondonVacationName()
	{
		return "LONDON SIGHTS VACATION";
	}

	public int calculateLocalTransportation()
	{
		System.out.println("This has a $200 city transportation budget");
		System.out.println("Including taxis, double-decker busses, and underground\n");
		return 200;  // for local taxis and buses
	}

	public int calculateExtraLodging()
	{
		System.out.println("Six more nights in the London hotel: $1350");
		return 225 * 6; // 6 nights in London hotels
	}
}