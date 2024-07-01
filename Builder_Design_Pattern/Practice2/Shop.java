package Builder_Design_Pattern.Practice2;

public class Shop {

    public static void main(String[] args) {
        Phone p = new PhoneBuilder()
        .setRam(4)
        .setOs("Apple IOS")
        .setBattery(5000)
        .getPhone();

        System.out.println(p);
    }
}
