package Decorator.Practice1;

//Concrete Decorators
public class CheeseBurstDecorator extends PizzaDecorator {
    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + addCheese();
    }

    public String addCheese() {
        return "Cheese";
    }
}
