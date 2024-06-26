package State;

public class Main {
    public static void main(String[] args) {
        Context contex = new Context();
        StartState startState = new StartState();
        startState.doAction(contex);
        System.out.println();
    }
}
