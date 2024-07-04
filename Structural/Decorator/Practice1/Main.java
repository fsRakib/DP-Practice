package Structural.Decorator.Practice1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JalepanoDecorator(new CheeseBurstDecorator(new BasePizza()));
        pizza = new JalepanoDecorator(pizza);
        System.out.println(pizza.bake());
    }
}
