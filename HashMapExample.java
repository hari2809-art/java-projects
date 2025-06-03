package demo;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String>StudentList=new HashMap<Integer, String>();
		StudentList.put(1, "dada");
		StudentList.put(2, "ravi");
		StudentList.put(3, "chaitu");
		StudentList.put(4, "ameen");
		StudentList.put(5, "teja");
		StudentList.put(6, "hari");
		StudentList.remove(2);
		StudentList.put(2,"ravi");
		System.out.println(StudentList);
	}

}
