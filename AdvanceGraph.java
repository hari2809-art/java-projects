package demo;
import java.util.*;

public class AdvanceGraph {
    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        void addEdge(int u, int v) {
            adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        void printGraph() {
            for (int node : adjList.keySet()) {
                System.out.print("Node " + node + " is connected to:");
                for (int neighbor : adjList.get(node)) {
                    System.out.print(neighbor+" ");
                }
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Graph obj = new Graph();
        obj.addEdge(1, 2);
        obj.addEdge(1, 3);
        obj.addEdge(1, 4);
        obj.addEdge(1, 4);
        obj.printGraph();
    }
}
