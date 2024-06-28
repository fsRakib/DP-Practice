package Structural.Decorator2;

public class Main {
    public static void main(String[] args) {
        Coffee coffee=new BaseCoffee();
        coffee=new MilkDecorator(coffee);
        coffee=new SugarDecorator(coffee);
        System.out.println(coffee.getCost());
    }
}
