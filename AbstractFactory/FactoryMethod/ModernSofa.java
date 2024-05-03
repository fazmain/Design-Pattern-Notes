package FactoryMethod;

public class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("--------------------");
        System.out.println("Sitting on a modern sofa.");
        System.out.println("--------------------");
    }
}

