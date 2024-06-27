package Creational.Abstruct_Factory;

public class Main {
    public static void main(String[] args) {
        Employee e1 = Factory.getEmployee(new AndroidDevFactory());
        e1.name();
        System.out.println("Salary: "+e1.salary());

        Employee e2= Factory.getEmployee(new WebDevFactory());
        e2.name();
    }
}
