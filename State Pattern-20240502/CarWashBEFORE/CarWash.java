package beforestate;

public class CarWash {

	private boolean carWashOpen = false;
	
	public void openCarWash()
	{
		if (carWashOpen)
		{
			System.out.println("Car Wash is already open!");
		}
		else
		{
			System.out.println("Car Wash is now OPEN!");
			carWashOpen = true;
		}
	}
	
	public void closeCarWash()
	{
		if (carWashOpen)
		{
			System.out.println("Car Wash is now CLOSED!");
			carWashOpen = false;
		}
		else
		{
			System.out.println("Car Wash is already CLOSED!");
		}		
	}
	
	public void washCar()
	{
		if (carWashOpen)
		{
			System.out.println("The car is now bring WASHED!");
		}
		else
		{
			System.out.println("Please come back when the Car Wash is OPEN!");
		}		
	}
	
	public String carWashStatus()
	{
		if (carWashOpen)
		{
			return "OPEN";
		}
		else
		{
			return "CLOSED";
		}
	}
}
