package Creational.Builder2;

public class Main {
    public static void main(String[] args) {
        Computer com = new Computer.ComputerBuilder()
                .setProcessor("intel i7")
                .setHdd(512)
                .setRam(16)
                .build();
        System.out.println(com);

        Computer com2 = new Computer.ComputerBuilder()
                .setProcessor("intel i9")
                .setHdd(2024)
                .setRam(68)
                .build();
        System.out.println(com2);
    }
}
