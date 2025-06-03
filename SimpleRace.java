package demo;
class Car{
	public void BMW() {
		for(int i=0;i<=3;i++) {
			System.out.println("car moving"+i);
		}
	}
}
class Bike{
	public void ninja() {
		for(int i=0;i<=3;i++) {
			System.out.println("bike moving"+i);
		}
	}
}
public class SimpleRace {
	public static void main(String[] args) {
		Car c=new Car();
		c.BMW();
		Bike b=new Bike();
		b.ninja();
	}
}
