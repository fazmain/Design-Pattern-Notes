package FinalExam;

public class EspressoFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}



