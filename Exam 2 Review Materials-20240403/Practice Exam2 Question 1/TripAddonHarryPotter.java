public class TripAddonHarryPotter extends TripAddon {
	public TripAddonHarryPotter(VacationCalculatorTemplateMethod vacation) {
		super(vacation);
	}

	@Override
	public int calculateCostActivity() {
		return 110 + vacation.calculateCostActivity();
	}

	@Override
	public int calculateCostTransportationExtra() {
		return 40 + vacation.calculateCostTransportationExtra();
	}

	@Override
	public int calculateCostLodgingExtra() {
		return 275 + vacation.calculateCostLodgingExtra();
	}

}
