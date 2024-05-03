public class TripAddonThames extends TripAddon {
	public TripAddonThames(VacationCalculatorTemplateMethod vacation) {
		super(decoratee);
	}

	@Override
	public int calculateCostActivity() {
		return 90 + vacation.calculateCostActivity();
	}

	@Override
	public int calculateCostTransportationExtra() {
		return 35 + vacation.calculateCostTransportationExtra();
	}

	@Override
	public int calculateCostLodgingExtra() {
		return 275 + vacation.calculateCostLodgingExtra();
	}
}
