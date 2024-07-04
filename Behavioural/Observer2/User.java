package Behavioural.Observer2;

//concrete 
public class User implements Subscriber {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String stockChannelName, String price) {
        System.out
                .println("Hi " + username + ", a new price (" + price + ") has been updated to " + stockChannelName
                        + " market.");

    }

}
