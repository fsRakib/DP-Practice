package Structural.Decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {

        return super.bake() + addCheese();
    }

    public String addCheese() {
        return "Cheese";
    }
}
