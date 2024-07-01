package Builder_Design_Pattern.Praactice3;

public class Main {
    public static void main(String[] args) {
        // Creating a house using the builder
        House house = new House.HouseBuilder()
                .setFoundation("concrete")
                .setInterior("LATHER")
                .build();
        System.out.println(house);
    }
}
