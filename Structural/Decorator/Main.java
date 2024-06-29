package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JalepanoDecorator(new CheeseDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
