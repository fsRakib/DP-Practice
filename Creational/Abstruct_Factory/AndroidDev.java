package Creational.Abstruct_Factory;

public class AndroidDev implements Employee {

    @Override
    public String name() {
        System.out.println("Hi.. I am Android Dev");
        return "Anndroid Dev";
    }

    @Override
    public int salary() {
        return 80000;
    }

}
