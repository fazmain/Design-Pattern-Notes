package decorator;

public class Author extends VerseDecorator{

  private String author;

  public Author(String author, Verse comp) {
    this.author = author;
    component = comp;
  }

  public void display(){
    component.display();
    System.out.println("            "+author);
  }
}