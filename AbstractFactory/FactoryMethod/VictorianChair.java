package FactoryMethod;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("--------------------");
        System.out.println("Sitting on a Victorian chair.");
        System.out.println("--------------------");
    }
}
