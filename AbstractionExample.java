package demo;
import java.util.*;
abstract class Car{
	public abstract void start();
	public abstract void drive();
}
class MyCar extends Car{
	private void checkengine() {
		System.out.println("engine checked");
	}
	private void checkelectronic() {
		System.out.println("electronic checked");
	}
	private void checkfuel() {
		System.out.println("fuel checked");
	}
	public void start() {
		checkengine();
		checkelectronic();
		checkfuel();
		System.out.println("car started");
	}
	public void drive() {
		System.out.println("car is driving...");
	}
}
public class AbstractionExample {
	public static void main(String[] args) {
		Car MyCar=new MyCar();
		MyCar.start();
		MyCar.drive();

	}

}
