package FactoryMethod;

public class Driver {
    public static void main(String[] args) {
        System.out.println("***");
        System.out.println("Factory Method Pattern");
        System.out.println("***");
        ChairFactory chairFactory = new ChairFactory();
        Chair chair = chairFactory.createChair("modern");
        chair.sitOn();

        SofaFactory sofaFactory = new SofaFactory();
        Sofa sofa = sofaFactory.createSofa("victorian");
        sofa.sitOn();
    }
}

