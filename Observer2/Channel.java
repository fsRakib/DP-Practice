package Observer2;

//subject
public interface Channel {
    void subscribe(Subscriber subscriber);

    void notifySubscribers(String price);
}
