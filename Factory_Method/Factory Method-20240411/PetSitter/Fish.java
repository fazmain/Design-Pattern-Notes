package petSitter;

public class Fish extends Pet{

	public Fish(int age, String name) {
		super(age, name);
	}

	public PetSitter getCareTaker(){
		return new FishSitter();
	}

}
