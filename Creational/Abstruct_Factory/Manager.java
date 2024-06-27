package Creational.Abstruct_Factory;

public class Manager implements Employee {

    @Override
    public String name() {
        System.out.println("I am a Manager");
        return "Manager";
    }

    @Override
    public int salary() {
        return 100000;
    }

}
