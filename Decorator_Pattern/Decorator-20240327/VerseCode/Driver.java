package decorator;

public class Driver {

	private Verse haiku1, verse1, verse2;
	private Verse limerick1, limerick2, verse3;
	
	public static void main (String args[]){
		new Driver().runCode();
	}

	public void runCode(){
		System.out.println("UNDECORATED VERSE:\n");
		haiku1 = new Haiku("Antenna searches",
				"Retreiver's nose in the wind",
				"Ether's far secrets");
		haiku1.display();
		System.out.println("\n\n");
		
		//*
		haiku1 = new Author("Neal Stephenson", haiku1);
		System.out.println("HAIKU DECORATED WITH AUTHOR ATTRIBUTION:\n");
		haiku1.display();
		System.out.println("\n\n");
		
		//*
		haiku1 = new EndFrill(haiku1);
		System.out.println("AUTHORED HAIKU DECORATED WITH ONE END FLOURISH:\n");
		haiku1.display();
		System.out.println("\n\n");

		/*
		haiku1 = new EndFrill(haiku1);
		System.out.println("AUTHORED HAIKU DECORATED WITH TWO END FLOURISHES:\n");
		haiku1.display();
		System.out.println("\n\n");
		
		//*
		System.out.println("AUTHORED HAIKU DECORATED WITH TOP AND TWO END FLOURISHES:\n");
		haiku1 = new TopFrill(haiku1);
		haiku1.display();
		System.out.println("\n\n");

		//*
		System.out.println("TITLED AND AUTHORED HAIKU DECORATED WITH TOP AND TWO END FLOURISHES:\n");
		haiku1 = new Title("Haiku", haiku1);
		haiku1.display();
		System.out.println("\n\n");
		verse1 = haiku1;

		//*
		verse2 = new Haiku("Patterns of design",
				"Templates for connecting thought",
				"Observe and apply");
		verse2 = new Title("Haiku", verse2);
		verse2 = new Author("J. Hacker", verse2);
		verse2.display();
		System.out.println("\n\n");

		//*
		limerick1 = new Limerick("There are creatures who write code on Saturn",
				"And unlike smart people that learn",
				"Their code was a waste",
				"They'd only cut 'n paste",
				"They never heard of a Design Pattern");
		
		System.out.println("UNDECORATED LIMERICK:\n");
		limerick1.display();
		System.out.println("\n\n");
		
		//*
		System.out.println("TITLED LIMERICK:\n");
		verse3 = new Title("Limerick", limerick1);
		verse3.display();
		System.out.println("\n\n");

		//*
		limerick2 = new Limerick("Of this limerick, the author's not proud",
				"It should be obscured by a shroud",
				"It has words like &#$!%",
				"And another is &$#$@",
				"Neither of which can we say out loud");
				
		//*
		System.out.println("UNDECORATED LIMERICK:\n");
		limerick2.display();
		System.out.println("\n\n");
		
		//*
		limerick2 = new Title("Limerick", limerick2);
		limerick2 = new EndFrill(limerick2);
		limerick2 = new TopFrill(limerick2);
		
		System.out.println("DECORATED LIMERICK\n");
		limerick2.display();
		System.out.println("\n\n");
		
		//*
		limerick1 = new Censor(limerick1, true);
		System.out.println("CENSORED CLEAN LIMERICK\n");
		limerick1.display();
		System.out.println("\n\n");
		
		//*
		limerick2 = new Censor(limerick2, false);
		System.out.println("CENSORED DIRTY LIMERICK\n");
		limerick2.display();
		System.out.println("\n\n");
		
		/*
		System.out.println("MISUSE OF DECORATIONS:\n");
		verse1 = new Author("Stephen King", verse1);
		verse1 = new Author("Maya Angelou", verse1);
		verse1 = new EndFrill(verse1);
		verse1 = new EndFrill(verse1);
		verse1 = new Author("Walter Mosley", verse1);
		verse1 = new Title("Free Verse", verse1);
		verse1 = new Title("Sonnet", verse1);
		verse1.display();
		//*/
	}
}
