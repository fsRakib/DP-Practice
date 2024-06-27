package Behavioral.Observer2;

public class Main {
    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel("fsNews");
        YoutubeChannel channel2 = new YoutubeChannel("Bangla-News");

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

        System.out.println("==============================");

        channel2.subscribe(user1);
        channel2.subscribe(user2);
        channel2.subscribe(user3);

        channel2.uploadVideo("SMTP, DNS, Web Server");
    }
}
