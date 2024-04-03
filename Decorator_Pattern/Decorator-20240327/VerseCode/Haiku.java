package decorator;

public class Haiku extends Verse{

  
  private String firstFiveSyl, sevenSyl, secondFiveSyl;
  public Haiku(String line1, String line2, String line3) {
	//clean = true;
    firstFiveSyl = line1;
    sevenSyl = line2;
    secondFiveSyl = line3;
  }

  public void display(){
    System.out.println(firstFiveSyl);
    System.out.println(sevenSyl);
    System.out.println(secondFiveSyl);
    System.out.println();
  }
}