package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Employee e1 = Factory.getEmployee("android");
        System.out.println(e1);

        Employee e2 = Factory.getEmployee("web");
        System.out.println(e2);
    }
}
