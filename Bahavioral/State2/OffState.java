package Bahavioral.State2;
// Concrete state
public class OffState implements State {

    @Override
    public void switchState(Light light) {
        System.out.println("Switching the light on");
        light.setState(new OnState());

    }

}
