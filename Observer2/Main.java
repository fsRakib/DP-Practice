package Observer2;

public class Main {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel("fsNews");
        YoutubeChannel channel2 = new YoutubeChannel("fsNews");

        User user1 = new User("Rakib");
        User user2 = new User("Arka");
        User user3 = new User("Siam");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Static NAT");

        System.out.println("==============================");
        channel.unsubscribe(user3);
        channel.uploadVideo("Dynamic NAT");
    }
}
