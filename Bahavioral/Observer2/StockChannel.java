package Bahavioral.Observer2;

import java.util.ArrayList;
import java.util.List;

public class StockChannel implements Channel {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String stockChannelName;

    public StockChannel(String stockChannelName) {
        this.stockChannelName = stockChannelName;
    }

    @Override
    public void notifySubscribers(String price) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(stockChannelName, price);
        }

    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);

    }

    public void uploadVideo(String price) {
        System.out.println("A new video '" + price + "' uploaded to channel '" + stockChannelName + "' ..");
        notifySubscribers(price);
    }
}
