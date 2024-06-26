package State;

//concrete class
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Start State");
        context.setState(this);

    }

    @Override
    public String toString() {
        return "Start State ..";
    }

}
