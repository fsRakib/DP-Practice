package Creational.Singleton;

public class Samosa {
    private static Samosa samosa; // store obj private, not to access anyone from outside

    private Samosa() { // constructor should private
    }

    // lazy initialization
    public static Samosa getSamosa() { // create obj with the help of method
        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
}
