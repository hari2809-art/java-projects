package demo;
import java.util.*;
public class GraphExample {
	public static void main(String[] args) {
		Map<String,List<String>> graph=new HashMap<>();
		graph.put("Alice", Arrays.asList("Bob"));
		graph.put("Bob", Arrays.asList("Alice","Charile"));
		graph.put("Charile", Arrays.asList("Bob"));
		for(String person:graph.keySet()) {
			System.out.println(person+" is friend with "+graph.get(person));
		}
	}

}
