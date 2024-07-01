package Observer2;

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

    public void updatePrice(String price) {
        System.out.println("New price (" + price + ")' changed to our Stock channel '" + stockChannelName + "' ..");
        notifySubscribers(price);
    }
}
