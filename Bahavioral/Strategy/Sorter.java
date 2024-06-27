package Behavioral.Strategy;

//wraper class...Context 
public class Sorter {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void SORT(int array[]) {
        sortStrategy.sort(array);
    }

}
// client should communicate with sorter