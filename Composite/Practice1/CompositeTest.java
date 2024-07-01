package Composite_Design_Pattern.Practice1;

public class CompositeTest {
    public static void main(String[] args) {
        Component hdd = new Leaf(4000, "HDD");
        Component monitor = new Leaf(8000, "MONITOR");
        Component mouse = new Leaf(500, "MOUSE");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(9000, "CPU");

        Composite ph = new Composite("PERIPHERALS");
        Composite cabinet = new Composite("CABINET");
        Composite mb = new Composite("MOTHER BOARD");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);
        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
