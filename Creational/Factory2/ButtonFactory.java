package Creational.Factory2;

// Factory class to create buttons based on operating system
public class ButtonFactory {
    // Method to create buttons
    public static Button createButton(String osType) {
        if ("Windows".equalsIgnoreCase(osType)) {
            return new WindowsButton();
        } else if ("Mac".equalsIgnoreCase(osType)) {
            return new MacButton();
        } else {
            throw new IllegalArgumentException("Unknown OS type");
        }
    }
}
