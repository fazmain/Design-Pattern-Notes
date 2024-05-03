package petSitter;

public class Cat extends Pet{

	public Cat(int age, String name) {
		super(age, name);
	}

	public PetSitter getCareTaker(){
		return new CatSitter();
	}

}