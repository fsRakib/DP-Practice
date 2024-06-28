package Bahavioral.State2;

//contex
public class Light {
    private State state;

    public Light() {
        state = new OffState();    // Initial state is Off
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchState() {
        state.switchState(this);
    }
}
