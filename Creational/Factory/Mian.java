package Creational.Factory;

public class Mian {
    public static void main(String[] args) {
        Employee employee = Factory.getEmployee("android");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Salary: " + salary);

        Employee employee2 = Factory.getEmployee("web");
        System.out.println(employee2);
        int salary2 = employee2.salary();
        System.out.println("Salary: " + salary2);
    }
}
