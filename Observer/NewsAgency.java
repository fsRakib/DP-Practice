package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel>channels= new ArrayList<>();

    public void addObserver(Channel channel){
        this.channels.add(channel);
    }
    
}
