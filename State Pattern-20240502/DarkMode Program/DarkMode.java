package state;

public class DarkMode extends Mode {

	public Mode toggle() {
		return new LightMode();

	}

	public String status() {
		return "DARK";
	}

}
