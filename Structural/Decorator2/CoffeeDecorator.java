package Structural.Decorator2;

// Decorator
public class CoffeeDecorator implements Coffee {
    protected Coffee decorateCoffee;

    public CoffeeDecorator(Coffee decorateCoffee) {
        this.decorateCoffee = decorateCoffee;
    }

    @Override
    public double getCost() {
        return decorateCoffee.getCost();
    }

}
