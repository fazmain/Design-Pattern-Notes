package FinalExam;

public interface Coffee {
    void serve(Glass glass);
    double cost();
}


abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public void serve(Glass glass) {
        coffee.serve(glass);
    }

    public double cost() {
        return coffee.cost();
    }
}

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    public void serve(Glass glass) {
        super.serve(glass);
        System.out.println("Adding milk foam");
    }

    public double cost() {
        return super.cost() + 0.50;
    }
}

class Cinnamon extends CoffeeDecorator {
    public Cinnamon(Coffee coffee) {
        super(coffee);
    }

    public void serve(Glass glass) {
        super.serve(glass);
        System.out.println("Adding cinnamon");
    }

    public double cost() {
        return super.cost() + 0.25;
    }
}

