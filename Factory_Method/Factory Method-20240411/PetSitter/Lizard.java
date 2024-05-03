package petSitter;

public class Lizard extends Pet {

	  public Lizard(int age, String name) {
		    super(age, name);
		  }

	@Override
	protected PetSitter getCareTaker() {
		return new LizardSitter();
	}

}
