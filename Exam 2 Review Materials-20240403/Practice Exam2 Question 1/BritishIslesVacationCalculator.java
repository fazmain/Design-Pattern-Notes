public class BritishIslesVacationCalculator extends VacationCalculatorTemplateMethod {
	public int calculateCostActivity()
    {
		return 75;  //Cost of visting Buckingham palace
    }
	
	public int calculateCostTransportationExtra() {
		return 400 + 230; //Cost for trains, buses, and ferries
	}

	public int calculateCostLodgingExtra() {
		return 180 + 425 + 375 + 190; //Cost of additional hotel stays: 1 London, 2 Dublin, 2 Glasglow, 1 Edinburgh
	}

}
