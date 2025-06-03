package demo;
import java.util.LinkedHashSet;
public class LinkedHashExample {
	public static void main(String[] args) {
		LinkedHashSet<String> cars=new LinkedHashSet<String>();
		cars.add("BMW");
		cars.add("Ferrari");
		cars.add("Audi");
		System.out.println(cars);
	}
}
