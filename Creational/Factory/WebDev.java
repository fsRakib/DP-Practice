package Creational.Factory;

public class WebDev implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Web Developer Salary");
        return 40000;
    }
    
}
