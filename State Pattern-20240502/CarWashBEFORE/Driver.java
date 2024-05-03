package beforestate;

public class Driver {

	private CarWash speedyCarWash = new CarWash();
	
	public static void main(String args[])
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		System.out.println("==============================");
		System.out.println("Speedy Car Wash is "+ speedyCarWash.carWashStatus());
		System.out.println();
		System.out.println("Attempt to close a CLOSED car wash: ");
		speedyCarWash.closeCarWash();
		System.out.println();
		System.out.println("Attempt to wash car at CLOSED car wash: ");
		speedyCarWash.washCar();
		System.out.println();
		System.out.println("Attempt to open a CLOSED car wash: ");
		speedyCarWash.openCarWash();
		System.out.println();
		System.out.println("==============================");
		System.out.println("Speedy Car Wash is "+ speedyCarWash.carWashStatus());
		System.out.println();
		System.out.println("Attempt to open an OPEN car wash: ");
		speedyCarWash.openCarWash();
		System.out.println();
		System.out.println("Attempt to wash car at OPEN car wash: ");
		speedyCarWash.washCar();
		System.out.println();
		System.out.println("Attempt to close an OPEN car wash: ");
		speedyCarWash.closeCarWash();
		System.out.println();
		System.out.println("==============================");
		System.out.println("Speedy Car Wash is "+ speedyCarWash.carWashStatus());		
	}
	
}
