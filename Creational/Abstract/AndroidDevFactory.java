package Creational.Abstract;

public class AndroidDevFactory extends AbstructFactory {

    @Override
    public Employee creatEmployee() {

        return new AndroidDev();
    }

}
