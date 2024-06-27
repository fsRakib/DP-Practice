package Creational.Abstruct_Factory;

public class AndroidDevFactory extends AbstructFactory{

    @Override
    public Employee creatEmployee() {
        
        return new AndroidDev();
    }
    
}
