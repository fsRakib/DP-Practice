package State;

public class Contex {
    private State state;

    public Contex() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
