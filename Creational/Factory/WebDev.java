package Creational.Factory;

public class WebDev implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Web Dev salary...");
        return 5000;
    }
    
}
