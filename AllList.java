package demo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
class StudentList {
    public void printList(Collection<String> students) {
        System.out.println("List of Students: " + students);
    }
    public void printList(Map<Integer, String> students) {
        System.out.println("List of Students (Map Format): " + students);
    }
}
class ArrayListDemo extends StudentList {
    public ArrayListDemo(ArrayList<String> students){
        printList(students);
    }
}
class LinkedListDemo extends StudentList {
    public LinkedListDemo(LinkedList<String> students){
        printList(students);
    }
}
class HashSetDemo extends StudentList {
    public HashSetDemo(HashSet<String> students){
        printList(students);
    }
}
class HashMapDemo extends StudentList {
    public HashMapDemo(HashMap<Integer, String> students){
        printList(students);
    }
}
public class AllList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ravi");
        students.add("Ravan");
        students.add("Ram");
        LinkedList<String> students1 = new LinkedList<>(students);
        HashSet<String> students2 = new HashSet<>(students);
        HashMap<Integer, String> students3 = new HashMap<>();
        students3.put(1, "Ravi");
        students3.put(2, "Ravan");
        students3.put(3, "Ram");
        new ArrayListDemo(students);
        new LinkedListDemo(students1);
        new HashSetDemo(students2);
        new HashMapDemo(students3);
    }
}
