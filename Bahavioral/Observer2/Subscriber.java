package Bahavioral.Observer2;

//observer interface
public interface Subscriber {
    void update(String stockChannelName, String price);
}
