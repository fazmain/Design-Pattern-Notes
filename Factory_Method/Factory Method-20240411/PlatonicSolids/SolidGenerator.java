
public class SolidGenerator {

	private Solid[] platonics = {new Tetrahedron(), new Cube(), new Octahedron(), new Dodecahedron(), new Icosahedron()};

	public Solid getSolid(int num)
	{
		return platonics[num];
	}
}
