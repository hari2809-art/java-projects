package java_with_dsa;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for ArrayList (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            arrayList.add(input); 
        }
        System.out.println("Final ArrayList: " + arrayList);
        scanner.close();
    }
}

