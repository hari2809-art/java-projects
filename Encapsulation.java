package demo;
import java.util.*;
public class Encapsulation {
	private String name;
	private int Rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkResult() {
		if(marks>=40) {
			return "pass";
		}
		else {
			return "fail";
		}
	}
	public void displayDetailList() {
		System.out.println("Rollno:"+" "+getRollno());
		System.out.println("Name:"+" "+getName());
		System.out.println("marks:"+" "+getMarks());
		System.out.println("Result:"+""+checkResult());
	}
	public static void main(String[]args) {
		Encapsulation student=new Encapsulation();
		   student.setRollno(101);
	       student.setName("John Doe");
	       student.setMarks(85);
	       System.out.println("\nStudent Details:");
	       student.displayDetailList();
	}

}
