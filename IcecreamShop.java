package java_with_dsa;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IcecreamShop {
    public static void main(String[] args) {
        Queue<String> iceCreamQueue = new LinkedList<>();
        iceCreamQueue.add("Teja");
        iceCreamQueue.add("Haran");
        iceCreamQueue.add("Ameen");
        iceCreamQueue.add("Hruday");
        iceCreamQueue.add("chaitu");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("\nCurrent queue: " + iceCreamQueue);
            System.out.println("First kid in queue: " + iceCreamQueue.peek());
            String servedKid = iceCreamQueue.poll();
            System.out.println("Serving ice cream to: " + servedKid);
            System.out.print("Enter name of new kid joining the queue: ");
            String newKid = scanner.nextLine();
            iceCreamQueue.add(newKid);
        }
        System.out.println("\nFinal queue after serving and adding kids: " + iceCreamQueue);
        scanner.close();
    }
}