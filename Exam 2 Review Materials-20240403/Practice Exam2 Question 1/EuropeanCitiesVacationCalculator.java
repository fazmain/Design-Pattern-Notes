public class EuropeanCitiesVacationCalculator extends VacationCalculatorTemplateMethod {
    public int calculateCostActivity() {
		return 75;  //Cost of visiting Buckingham palace
    }
	
    public int calculateCostTransportationExtra() {
    	return 140 + 350 + 420;  //Cost of additional train and air fares
    }

    public int calculateCostLodgingExtra() {
    	return 375 + 750 + 420; //Cost of additional hotel stays: 6 London, 2 Paris, 2 Rome
    }
}