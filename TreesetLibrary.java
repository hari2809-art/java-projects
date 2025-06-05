package demo;
import java.util.TreeSet;
public class TreesetLibrary {
    public static void main(String[] args) {
        TreeSet<Integer> bookIds = new TreeSet<>();
        bookIds.add(5002);
        bookIds.add(4998);
        bookIds.add(5005);
        bookIds.add(4999);
        bookIds.add(5001);
        System.out.println("First book ID: " + bookIds.first());
        System.out.println("Last book ID: " + bookIds.last());
        System.out.println("ID just higher than 4999: " + bookIds.higher(4999));
        System.out.println("ID just lower than 5005: " + bookIds.lower(5005));
    }
}