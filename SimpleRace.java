package java_with_dsa;

class car{
	public void BMW() {
		for(int i=1;i<=3;i++)
		{System.out.println("car moving"+i);
		}
	}
}
class Bike{
	public void ninja()
	{
		for(int i=1;i>=3;i++)
		{
			System.out.println("Bike moving"+i);
		}
	}
}
public class SimpleRace {
	public static void main(String[] args) {
		car c=new car();
		c.BMW();
		Bike b=new Bike();
		b.ninja();
	}
}
