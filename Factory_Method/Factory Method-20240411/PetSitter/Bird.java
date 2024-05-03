package petSitter;

public class Bird extends Pet{

	public Bird(int age, String name) {
		super(age, name);
	}

	public PetSitter getCareTaker(){
		return new BirdSitter();
	}

}