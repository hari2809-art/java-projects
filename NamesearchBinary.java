package demo;
import java.util.Arrays;
public class NamesearchBinary {
    public static void main(String[] args) {
        String[] names = {"amit", "divya", "karan", "priya", "zoya"};
        String searchName = "karan";
        int index = Arrays.binarySearch(names, searchName);
        if (index >= 0) {
            System.out.println(searchName + " found at index " + index);
        } else {
            System.out.println(searchName + " not found in the list.");
        }
    }
}