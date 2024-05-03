package FinalExam;

/*
Description: The sample code implements a part of a coffee shop using three design patterns:
Factory Method, Decorator, and Command. 
The Factory Method pattern is used to create coffee and glass objects. 
The Decorator pattern is used to add extra ingredients to the coffee. 
The Command pattern is used to serve the coffee in a glass.
*/

public class Client {
    public static void main(String[] args) {
        CoffeeFactory cFactory = new EspressoFactory(); // storing a EspressoFactory in generic CoffeeFactory
        Coffee coffee = cFactory.createCoffee(); // storing a Espresso in generic Coffee

        GlassFactory gFactory = new ShotGlassFactory(); // storing a ShotGlassFactory in generic GlassFactory
        Glass glass = gFactory.createGlass(); // storing a ShotGlass in generic Glass

        // modifying the coffee with decorators
        coffee = new Cinnamon(coffee);
        coffee = new Caramel(coffee);


        // generic serve coffee command
        Command serveCoffee = new ServeCoffeeCommand(coffee, glass);

        int balance = 5;
        
        // if the balance is not enough, the order gets cancelled and the user is notified
        if (balance < coffee.cost()) {
            Command candelOrderCommand = new CancelOrderCommand();
            System.out.println("Not enough money to pay for the coffee.");
            candelOrderCommand.execute();
            return;
        }

        serveCoffee.execute();

    }
    
}
