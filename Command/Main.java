package Command_Design_Pattern;

//Client (Controller)
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RemoteController remoteController = new RemoteController(lightOnCommand);
        remoteController.pressButton();

        LightOffComand lightOffComand = new LightOffComand(light);
        remoteController.setCommand(lightOffComand);
        remoteController.pressButton();
    }
}