package State;

import javax.naming.Context;

//concrete class
public class StopState implements State {

    @Override
    public void doAction(C context) {
        System.out.println("Player is in Start State");
        context.setState(this);
        
    }

    @Override
    public String toString() {
        return "Stop State ..";
    }
    
}
