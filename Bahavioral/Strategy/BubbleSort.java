package Bahavioral.Strategy;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        int size = arr.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println("Bubble sort done");
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
