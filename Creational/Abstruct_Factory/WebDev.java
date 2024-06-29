package Creational.Abstruct_Factory;

public class WebDev implements Employee{
    @Override
    public String name() {
        System.out.println("Hi.. I am Web Dev");
        return "Web Dev";
    }

    @Override
    public int salary() {
        return 75000;
    }
}
