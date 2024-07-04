package Creational.Factory;

public class Factory {
    // get employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Android")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("Web")) {
            return new WebDev();
        } else {
            return null;
        }
    }
}
