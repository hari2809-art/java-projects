package demo;
import java.util.Arrays;
public class BubbleStrting {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "mango", "grape"};
        bubbleSort(words);
        System.out.println("Sorted Strings: " + Arrays.toString(words));
    }
}