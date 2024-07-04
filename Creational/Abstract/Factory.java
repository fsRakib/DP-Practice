package Creational.Abstract;

public class Factory {
    // get employee
    public static Employee getEmployee(AbstructFactory absFactory) {
        return absFactory.creatEmployee();
    }
}
