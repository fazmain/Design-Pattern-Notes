package afterstate;

public class CarWashClosed extends CarWashState {
	
	private CarWashOpen open = new CarWashOpen(this);
	
	public CarWashState openCarWash()
	{
		System.out.println("Car Wash is now OPEN!");
		return open;
	}
	
	public CarWashState closeCarWash()
	{
		System.out.println("Car Wash is already CLOSED!");		
		return this;
	}
	
	public void washCar()
	{
		System.out.println("Please come back when the Car Wash is OPEN!");
	}
	
	public String carWashStatus()
	{
		return "CLOSED";
	}
}
