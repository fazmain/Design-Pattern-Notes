package templateMethod;

/*
 * Customized costs for the European Cities option of the Vacation
 * 
 * Author: D. Palmer Date: 2-23-2021 (updated from an earlier version)
 */

public class EuropeanCitiesVacationCalculator extends VacationCalculatorTemplateMethod
{
	public String getLondonVacationName()
	{
		return "EUROPEAN CITIES VACATION";
	}
	
    public int calculateLocalTransportation()
    {
		System.out.println("This has a $140 Chunnel train ride to Paris\n");
		System.out.println("and a $350 flight to Rome from Paris");
		System.out.println("and a $420 flight from Rome back to London");

    	return 140 + 350 + 420;  // additional train and air fares
    }

    public int calculateExtraLodging()
    {
		System.out.println("Two additional nights accomodation in London: $375");
		System.out.println("Two nights in Paris: $750");
		System.out.println("Two nights in Rome: $420");

    	return 375 + 750 + 420; // 2 London, 2 Paris, 2 Rome
    }
}