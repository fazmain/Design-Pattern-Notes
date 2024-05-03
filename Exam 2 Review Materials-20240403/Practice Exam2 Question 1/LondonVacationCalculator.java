public class LondonVacationCalculator extends VacationCalculatorTemplateMethod {
    public int calculateCostActivity() {
		return 100;  //Cost of a show at the West End theatre
    }
	
    public int calculateCostTransportationExtra() {
    	return 200;  //Cost for local taxis and buses
    }

    public int calculateCostLodgingExtra() {
    	return 225 * 6; //Cost for 6 nights in London hotels
    }
}