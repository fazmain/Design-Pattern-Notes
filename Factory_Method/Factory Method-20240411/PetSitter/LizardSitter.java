package petSitter;

public class LizardSitter extends PetSitter {

	@Override
	public void feedPet() {
		// TODO Auto-generated method stub
		System.out.println("Here are some nice flies");
	}

	@Override
	public void comfortPet() {
		System.out.println("Turn on heat lamp");

	}

	@Override
	public void cleanHabitat() {
		System.out.println("Scrub the tub)");

	}

	@Override
	public void entertainPet() {
		System.out.println("Show old silent movies");
	}

}
