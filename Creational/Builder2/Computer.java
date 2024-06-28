package Creational.Builder2;

public class Computer {
    // parameters
    private String processor;
    private int ram;
    private int hdd;

    // private constructor
    private Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Computer [processor=" + processor + ", ram=" + ram + ", hdd=" + hdd + "]";
    }

    // Setters for the builder
    private void setProcessor(String processor) {
        this.processor = processor;

    }

    private void setRam(int ram) {
        this.ram = ram;

    }

    private void setHdd(int hdd) {
        this.hdd = hdd;

    }

    public static class ComputerBuilder {

        private String processor;
        private int ram;
        private int hdd;

        // build Computer object
        public Computer build() {
            Computer computer = new Computer();
            computer.setProcessor(this.processor);
            computer.setRam(this.ram);
            computer.setHdd(this.hdd);
            return computer;
        }
    }
}
