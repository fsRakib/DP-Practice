package Bahavioral.Observer2;

public class Main {
    public static void main(String[] args) {

        StockChannel channel = new StockChannel("Dhaka Stock");
        StockChannel channel2 = new StockChannel("Chitagong Stock");

        User user1 = new User("Rakib");
        User user2 = new User("Arka");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("5000");

    }
}
