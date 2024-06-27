package Structural.Decorator;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    @Override
    public String bake() {
        return pizza.bake();
    }

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
