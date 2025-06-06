package java_with_dsa;
import java.util.Scanner;
public class RainUmbrella {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine().toLowerCase();
		//boolean isRaining=false;
		if(a=="yes") {
			System.out.println("Take an Ubmbrella");	
		}
		else {
			System.out.println("no need of Umbrella");
		}
		sc.close();
	}
}
