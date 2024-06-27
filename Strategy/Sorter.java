package Strategy;

//wraper class...Context 
public class Sorter {
    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
