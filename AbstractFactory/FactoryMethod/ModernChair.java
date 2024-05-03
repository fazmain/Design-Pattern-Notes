package FactoryMethod;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("--------------------");
        System.out.println("Sitting on a modern chair.");
        System.out.println("--------------------");
    }
}