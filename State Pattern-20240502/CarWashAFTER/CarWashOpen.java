package afterstate;

public class CarWashOpen extends CarWashState {
	
	private CarWashClosed closed;
	
	public CarWashOpen(CarWashClosed state)
	{
		closed = state;
	}
	
	public CarWashState openCarWash()
	{
		System.out.println("Car Wash is already open!");
		return this;
	}
	
	public CarWashState closeCarWash()
	{
		System.out.println("Car Wash is now CLOSED!");
		return closed;
	}
	
	public void washCar()
	{
		System.out.println("The car is now bring WASHED!");
	}
	
	public String carWashStatus()
	{
		return "OPEN";
	}
}
