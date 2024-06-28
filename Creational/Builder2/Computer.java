package Creational.Builder2;

public class Computer {
    // parameters
    private String processor;
    private int ram;
    private int hdd;

    // private constructor
    private Computer(String processor, int ram, int hdd) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer [processor=" + processor + ", ram=" + ram + ", hdd=" + hdd + "]";
    }
     //static inner Builder Class
     public static class Computer
}
