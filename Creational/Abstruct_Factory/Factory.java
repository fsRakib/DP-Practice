package Creational.Abstruct_Factory;

public class Factory {
    // get employee
    public static Employee getEmployee(AbstructFactory factory) {
        return factory.creatEmployee();
    }
}
