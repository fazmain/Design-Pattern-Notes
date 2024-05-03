package FinalExam;

public class Cappuccino implements Coffee {
    public void serve(Glass glass) {
        System.out.println("Serving Cappuccino in a " + glass.getType() + " glass.");
    }

    public double cost() {
        return 2.00;
    }
}