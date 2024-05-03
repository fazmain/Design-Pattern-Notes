package NoAbstractFactory;

public class Driver {
    public static void main(String[] args) {

        System.out.println("***");
        System.out.println("No Design Pattern");
        System.out.println("***");
        Chair modernChair = new ModernChair();
        // Sofa modernSofa = new ModernSofa();

        modernChair.sitOn();
        // modernSofa.sitOn();

        Chair victorianChair = new VictorianChair();
        // Sofa victorianSofa = new VictorianSofa();

        victorianChair.sitOn();
        // victorianSofa.sitOn();
    }
}
