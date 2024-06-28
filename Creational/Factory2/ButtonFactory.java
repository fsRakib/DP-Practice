package Creational.Factory2;

// Factory class
public class ButtonFactory {
    // Method to create buttons
    public static Button createButton(String osType) {
        if ("Windows".equalsIgnoreCase(osType)) {
            return new WinButton();
        } else if ("Mac".equalsIgnoreCase(osType)) {
            return new MacButton();
        } else {
            return null;
        }
    }
}
