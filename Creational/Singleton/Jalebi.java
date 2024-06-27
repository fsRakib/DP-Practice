package Creational.Singleton;

//eager way of creating obj
public class Jalebi {
    private static Jalebi jalebi= new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
