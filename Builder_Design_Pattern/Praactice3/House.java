package Builder_Design_Pattern.Praactice3;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public House(String foundation, String structure, String roof, String interior) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", interior="
                + interior + "]";
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public House build() {
            return new House(foundation, structure, roof, interior);
        }

    }
}
