package Creational.Singleton;

public class Main {
    public static void main(String[] args) {

        Samosa samosa = Samosa.getSamosa();
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

    }
}
