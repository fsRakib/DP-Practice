package Bahavioral.Observer2;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String channeLName;

    public YoutubeChannel(String channeLName) {
        this.channeLName = channeLName;
    }

    @Override
    public void notifySubscribers(String videoname) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channeLName, videoname);
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

    public void uploadVideo(String videoname) {
        System.out.println("A new video '" + videoname + "' uploaded to channel '" + channeLName + "' ..");
        notifySubscribers(videoname);
    }
}
