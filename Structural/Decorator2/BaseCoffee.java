package Structural.Decorator2;

// Concrete Component
public class BaseCoffee implements Coffee {

    @Override
    public double getCost() {
        return 20;
    }
}
