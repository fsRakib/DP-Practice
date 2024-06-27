package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setUsername("Rakib")
                //.setUserId("fsRakib")
                .setAddress("Uttara, Dhaka-1230")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder()
                .setUsername("Rakib")
                //.setUserId("fsRakib")
                .setAddress("Uttara, Dhaka-1230")
                .build();
        System.out.println(user1);

    }
}
