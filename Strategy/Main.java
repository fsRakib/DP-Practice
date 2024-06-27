package Strategy;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 2, 66, 7, 9 };

        Sorter sorter = new Sorter();
        sorter.setSortStrategy(new BubbleSort());
        sorter.SORT(arr);

        sorter.setSortStrategy(new SelectionSort());
        sorter.SORT(arr);
    }
}
