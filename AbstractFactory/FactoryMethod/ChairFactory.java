package FactoryMethod;

public class ChairFactory {
    public Chair createChair(String style) {
        if (style.equalsIgnoreCase("modern")) {
            return new ModernChair();
        } else if (style.equalsIgnoreCase("victorian")) {
            return new VictorianChair();
        } else {
            throw new IllegalArgumentException("Unknown style: " + style);
        }
    }
}

