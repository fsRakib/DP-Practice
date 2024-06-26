package Observer2;

//concrete observer
public class User implements Subscriber {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoName) {
        System.out.println("Hi "+username+", a new video "+videoName+"has been uploaded to "+channelName+"channel.");

    }

}
