package demo;
import java.util.TreeSet;
import java.util.Comparator;
public class NamesorterReverse {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("Alice");
        names.add("David");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names in reverse order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
