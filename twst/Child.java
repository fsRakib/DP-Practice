package twst;

public class Child extends P {
    private int extraData;

    public Child(int data, int extraData) {
        super(data); // Explicit call to the Parent class constructor
        this.extraData = extraData;
        System.out.println("Child constructor called with extraData: " + extraData);
    }
}
