package demo;
import java.util.*;
public class SortStrings {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        treeSet.add("mango");
        treeSet.add("grape");
        System.out.println("Sorted Strings: " + treeSet);
    }
}