public class TripAddonBigBen extends TripAddon {
	public TripAddonBigBen(VacationCalculatorTemplateMethod vacation) {
		super(vacation);
	}

	public int calculateCostActivity() {
		return 15 + vacation.calculateCostActivity();
	}

	public int calculateCostTransportationExtra() {
		return 25 + vacation.calculateCostTransportationExtra();
	}

	public int calculateCostLodgingExtra() {
		return 275 + vacation.calculateCostLodgingExtra();
	}

}
