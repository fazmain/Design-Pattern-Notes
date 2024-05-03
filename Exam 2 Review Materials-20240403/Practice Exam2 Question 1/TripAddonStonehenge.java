public class TripAddonStonehenge extends TripAddon {
	public TripAddonStonehenge(VacationCalculatorTemplateMethod decoratee) {
		super(decoratee);
	}

	@Override
	public int calculateCostActivity() {
		return 15 + decoratee.calculateCostActivity();
	}

	@Override
	public int calculateCostTransportationExtra() {
		return 75 + decoratee.calculateCostTransportationExtra();
	}

	@Override
	public int calculateCostLodgingExtra() {
		return 275 + decoratee.calculateCostLodgingExtra();
	}

}
