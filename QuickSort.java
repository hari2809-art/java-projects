package javapj;

public class QuickSort {

    // QuickSort function
    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function to place pivot in correct position
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot element with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Returning correct pivot index
    }

    // Utility function to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};
        System.out.println("Before Sorting:");
        printArray(numbers);

        // Performing QuickSort
        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("After Sorting:");
        printArray(numbers);
    }
}
