package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        new User.UserBuilder().setUsername("Rakib").setUserId("fsRakib").setAddress("Uttara, Dhaka-1230").build();

    }
}
