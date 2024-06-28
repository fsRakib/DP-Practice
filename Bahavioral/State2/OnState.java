package Bahavioral.State2;

// Concrete state
public class OnState implements State {

    @Override
    public void switchState(Light light) {
        System.out.println("Switching the light off");
        light.setState(new OffState());

    }

}
