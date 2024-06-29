package Bahavioral.Strategy;

public class SelectionSort implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; // searching for the lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Selection sort done");

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
