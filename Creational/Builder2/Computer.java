package Creational.Builder2;

public class Computer {
    // parameters
    private String processor;
    private int ram;
    private int hdd;

    // private constructor
    public Computer() {
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

    public static class ComputerBuilder {

        private String processor;
        private int ram;
        private int hdd;

        // Setters for the builder
        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;

        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        // build Computer object
        public Computer build() {
            Computer computer = new Computer();
            computer.setProcessor(this.processor);
        }
    }
}
