package Creational.Abstruct_Factory;

public class WebDevFactory extends AbstructFactory {

    @Override
    public Employee creatEmployee() {

        return new WebDev();
    }

}
