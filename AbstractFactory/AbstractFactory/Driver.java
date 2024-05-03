public class Driver {
    public static void main(String[] args) {
        System.out.println("***");
        System.out.println("Abstract Factory Pattern");
        System.out.println("***");
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.sitOn();

        factory = new VictorianFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();

        chair.sitOn();
        sofa.sitOn();
    }
}
