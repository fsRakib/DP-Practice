package Builder_Design_Pattern.Practice2;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
    
    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "PHONE [OS-" + os + ", RAM-" + ram + "GB, Processor-" + processor + ", ScreenSize-" + screenSize + "inch, Battery-" + battery + "mAh]";
    }
}
