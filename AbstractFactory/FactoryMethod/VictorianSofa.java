package FactoryMethod;

public class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("--------------------");
        System.out.println("Sitting on a Victorian sofa.");
        System.out.println("--------------------");
    }
}
