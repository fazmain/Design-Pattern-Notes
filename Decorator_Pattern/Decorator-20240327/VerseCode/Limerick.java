package decorator;

public class Limerick extends Verse{

  private String firstLineA, secondLineA, thirdLineB, fourthLineB, fifthLineA;
  
  public Limerick(String line1, String line2, String line3,
                                    String line4, String line5) {
     firstLineA = line1;
     secondLineA = line2;
     thirdLineB = line3;
     fourthLineB = line4;
     fifthLineA = line5;
  }

  public void display(){
    System.out.println(firstLineA);
    System.out.println(secondLineA);
    System.out.println(thirdLineB);
    System.out.println(fourthLineB);
    System.out.println(fifthLineA);
  }
}