package Creational.Abstract;

public class Main {
    public static void main(String[] args) {
        Employee e1 = Factory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.name());
        
        Employee e2 = Factory.getEmployee(new WebDevFactory());
        System.out.println(e2.name());
    }
}
