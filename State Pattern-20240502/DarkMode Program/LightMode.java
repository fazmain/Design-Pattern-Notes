package state;

public class LightMode extends Mode {

	public Mode toggle() {
		return new DarkMode();
	}

	public String status() {
		return "LIGHT";
	}

}
