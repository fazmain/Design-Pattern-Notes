public abstract class VacationCalculatorTemplateMethod {
	/*
	 * There are four possibilities for this trip:
	 * 	1. Spend the entire week in London, England
	 * 	2. Spend 2 days in London, 2 days in Paris, and 2 days in Rome
	 * 	3. Spend the week bicycling through the English countryside
	 * 	4. Spend the week traveling around the British Isles
	 */
	
	public static void main(String args[]) {
    	System.out.println("$" + new LondonVacationCalculator().calculateCostTotal());
    	System.out.println("$" + new EuropeanCitiesVacationCalculator().calculateCostTotal());
    	System.out.println("$" + new BikingEnglandVacationCalculator().calculateCostTotal());
    	System.out.println("$" + new BritishIslesVacationCalculator().calculateCostTotal());
    	System.out.println("$" + new TripAddonStonehenge(new BritishIslesVacationCalculator()).calculateCostTotal());
    	System.out.println("$" + new TripAddonThames(new TripAddonStonehenge(new BritishIslesVacationCalculator())).calculateCostTotal());
    }

    public final int calculateCostTotal() {
        int costTransportation, costLodging, costActivity, costTotal;

        costTransportation = 1200; //Cost of roundtrip airfare from Cleveland to London                                                     
        costTransportation += calculateCostTransportationExtra();
        
        costLodging = 245; //Cost of one night in the London airport hotel                                                                  
        costLodging += calculateCostLodgingExtra();
        
        costActivity = calculateCostActivity();
        
        costTotal = costTransportation + costLodging + costActivity;

        return costTotal;
    }
    
    public abstract int calculateCostActivity();
    
    public abstract int calculateCostTransportationExtra();

    public abstract int calculateCostLodgingExtra();
}
