package Behavioural.Observer2;

public class Main {
    public static void main(String[] args) {

        StockChannel ch1 = new StockChannel("Dhaka Stock");
        StockChannel ch2 = new StockChannel("Chitagong Stock");

        User user1 = new User("Rakib");
        User user2 = new User("Arka");

        ch1.subscribe(user1);
        ch1.subscribe(user2);

        ch1.updatePrice("5000");
System.out.println();
        ch2.subscribe(user2);
        ch2.subscribe(user1);

        ch2.updatePrice("12000");

    }
}
