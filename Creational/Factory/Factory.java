package Creational.Factory;

public class Factory {
    // get employee
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("android")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("web")) {
            return new WebDev();
        } else {
            return null;
        }
    }
}
