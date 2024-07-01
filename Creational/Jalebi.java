public class Jalebi {
    // private static Jalebi jalebi = new Jalebi();
    public Jalebi jalebi() {
        return new Jalebi();
    }

    // eager way
    public static Jalebi getJalebi() {
        return jalebi;
    }
}
