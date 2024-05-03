package FinalExam;

public class Espresso implements Coffee {
    public void serve(Glass glass) {
        System.out.println("Serving Espresso in a " + glass.getType() + " glass.");
    }

    public double cost() {
        return 1.50;
    }
}
