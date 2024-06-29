package Creational.Factory;

public class AndroidDev implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Android Dev salary...");
        return 4000;
    }

}
