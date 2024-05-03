package afterstate;

public class CarWash {

	private CarWashState status = new CarWashClosed();
	
	public void openCarWash()
	{
		status = status.openCarWash();
	}

	public void closeCarWash()
	{
		status = status.closeCarWash();
	}

	public void washCar()
	{
		status.washCar();
	}

	public String carWashStatus()
	{
		return status.carWashStatus();
	}
}
