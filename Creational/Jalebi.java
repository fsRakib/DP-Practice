public class Jalebi {
    private static Jalebi jalebi = new Jalebi();

    // eager way
    private static Jalebi getJalebi() {
        return jalebi;
    }
}
