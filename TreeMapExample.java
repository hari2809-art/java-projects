package demo;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> StudentMarks=new TreeMap<Integer, String>();
		StudentMarks.put(101, "teja");
		StudentMarks.put(150, "Ravi");
		StudentMarks.put(100, "Ram");
		System.out.println(StudentMarks);
	}

}
