
public abstract class Solid {

	protected String solidName, faceShape;	
	protected int faces, edges, vertices;
	
	public void display()
	{
		System.out.println("This is the Platonic Solid: "+ solidName);
		System.out.println("It consists of "+ faces +" "+ faceShape+" faces, "+ edges + " edges, and "+vertices+" vertices.");
	}
}
