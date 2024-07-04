package Creational.Abstract;

public class WebDevFactory extends AbstructFactory {

    @Override
    public Employee creatEmployee() {

        return new WebDev();                  
    }

}
