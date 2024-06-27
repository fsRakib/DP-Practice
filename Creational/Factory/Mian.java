package Creational.Factory;

public class Mian {
    public static void main(String[] args) {
        Employee employee = Factory.getEmployee("android");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Salary: " + salary);
    }
}
