package decorator;

public class TopFrill extends VerseDecorator{

  public TopFrill(Verse comp) {
    component = comp;
  }

  public void display(){
    System.out.println("@=@=@=@=@=@=@=@=@=@=@=@=@=@=@=@=@=@");
    component.display();
  }
}