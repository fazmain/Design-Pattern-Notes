package petSitter;

public abstract class Pet {
	public int age;
	public String name;

	protected Pet(int age, String name) {
		this.age = age;
		this.name = name;
	}


	protected abstract PetSitter getCareTaker();
}

