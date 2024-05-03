package afterstate;

public abstract class CarWashState {
	
	public abstract CarWashState openCarWash();
	
	public abstract CarWashState closeCarWash();
	
	public abstract void washCar();
	
	public abstract String carWashStatus();
}
