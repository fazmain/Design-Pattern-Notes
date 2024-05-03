package petSitter;

public class Dog extends Pet{

	  public Dog(int age, String name) {
	    super(age, name);
	  }

	  public PetSitter getCareTaker(){
	    return new DogSitter();
	  }
	}