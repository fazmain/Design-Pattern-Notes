package FactoryMethod;

public class SofaFactory {
    public Sofa createSofa(String style) {
        if (style.equalsIgnoreCase("modern")) {
            return new ModernSofa();
        } else if (style.equalsIgnoreCase("victorian")) {
            return new VictorianSofa();
        } else {
            throw new IllegalArgumentException("Unknown style: " + style);
        }
    }
}
