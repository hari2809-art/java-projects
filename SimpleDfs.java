package demo;
import java.util.*;

public class SimpleDfs {
	private Map<String,List<String>> homeMap=new HashMap<String, List<String>>();
	private Set<String> visited=new HashSet<String>();
	public void addRoom(String room,String connectedRoom) {
		homeMap.computeIfAbsent(room,k->new ArrayList<>()).add(connectedRoom);
		homeMap.computeIfAbsent(connectedRoom,k->new ArrayList<>()).add(room);
	}
	public void dfs(String currentRoom) {
		if(visited.contains(currentRoom)) return;
		visited.add(currentRoom);
		System.out.println("Visited:"+currentRoom);
		for(String neighbour:homeMap.getOrDefault(currentRoom, new ArrayList<String>()))
			dfs(neighbour);
	}
	public static void main(String[] args) {
		SimpleDfs home=new SimpleDfs();
		home.addRoom("Living Room", "Kitchen");
		home.addRoom("Living Room", "Bedroom");
		home.addRoom("Bedroom", "Bathroom");
		System.out.println("Dfs traversal starting from living room:\n");
		home.dfs("Living Room");
	}

}
