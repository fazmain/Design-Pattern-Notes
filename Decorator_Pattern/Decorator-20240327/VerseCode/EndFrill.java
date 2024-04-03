package decorator;

public class EndFrill extends VerseDecorator{

  public EndFrill(Verse comp) {
    component = comp;
  }

  public void display(){
    component.display();
    System.out.println("#################################");
  }
}