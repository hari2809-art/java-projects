package javapj;
import java.util.*;
public class SocialCricle {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("Alice", List.of("Bob", "Charlie"));
        graph.put("Bob", List.of("Alice", "David"));
        graph.put("Charlie", List.of("Alice", "Eve"));
        graph.put("David", List.of("Bob"));
        graph.put("Eve", List.of("Charlie"));
        graph.put("Frank", List.of("Grace"));
        graph.put("Grace", List.of("Frank"));
        System.out.println("Recursive DFS: " + dfsRecursive(graph, "Alice", new HashSet<>()));
        System.out.println("Iterative DFS: " + dfsIterative(graph, "Alice"));
        System.out.println("All Connected Components: " + findAllConnectedComponents(graph));
    }
    static Set<String> dfsRecursive(Map<String, List<String>> graph, String person, Set<String> visited) {
        if (visited.add(person)) 
            for (String neighbor : graph.getOrDefault(person, List.of())) 
                dfsRecursive(graph, neighbor, visited);
        return visited;
    }
    static Set<String> dfsIterative(Map<String, List<String>> graph, String person) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);
        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (visited.add(current)) 
                stack.addAll(graph.getOrDefault(current, List.of()));
        }
        return visited;
    }
    static List<Set<String>> findAllConnectedComponents(Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        List<Set<String>> components = new ArrayList<>();
        for (String person : graph.keySet()) {
            if (!visited.contains(person)) {
                Set<String> component = dfsIterative(graph, person);
                components.add(component);
                visited.addAll(component);
            }
        }
        return components;
    }
}