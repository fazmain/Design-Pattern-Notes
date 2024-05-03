package FinalExam;

public class ServeCoffeeCommand implements Command {
    private Coffee coffee;
    private Glass glass;

    public ServeCoffeeCommand(Coffee coffee, Glass glass) {
        this.coffee = coffee;
        this.glass = glass;
    }

    public void execute() {
        coffee.serve(glass);
        System.err.println("Please pay: " + coffee.cost());
    }
}