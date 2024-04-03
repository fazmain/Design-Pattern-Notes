package decorator;

public class Title extends VerseDecorator{

	private String title;

	public Title(String title, Verse comp) {
		this.title = title;
		component = comp;
	}

	public void display(){
		System.out.println(title+":");
		component.display();
	}
}