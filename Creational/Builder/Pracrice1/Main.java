package Creational.Builder.Pracrice1;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setEmailId("rakibul51@student.sust.edu")
                .setUserId("bnz350")
                .setUserName("fsRakib")
                .build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("bnz450")
                .setUserName("Arka")
                .setEmailId("arka@student.iubat.edu")
                .build();
        System.out.println(user2);
    }
}
