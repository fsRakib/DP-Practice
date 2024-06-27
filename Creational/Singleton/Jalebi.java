package Creational.Singleton;

public class Jalebi {
    private static Jalebi jalebi= new Jalebi();

    private static Jalebi getJalebi(){
        return jalebi;
    }
}
