public class Samosa {
    private static Samosa samosa; //store obj private not 

    private Samosa() { // constructor should private
    }

    public static Samosa getSamosa() { //create obj with the help of method
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}
