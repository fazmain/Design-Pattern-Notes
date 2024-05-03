package state;

public abstract class Mode {
	protected String status;
	
	public abstract Mode toggle();
	public abstract String status();

}
