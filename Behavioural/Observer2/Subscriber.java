package Behavioural.Observer2;

//observer 
public interface Subscriber {
    void update(String stockChannelName, String price);
}
