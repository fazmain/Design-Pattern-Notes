package decorator;

public abstract class VerseDecorator extends Verse{

  protected Verse component;

  public void display(){
    component.display();
  }
}