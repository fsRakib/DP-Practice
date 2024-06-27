package Creational.Abstruct_Factory;

public class ManagerFactory extends AbstructFactory {

    @Override
    public Employee creatEmployee() {

        return new Manager();
    }

}
