package java_with_dsa;
import java.util.*;
public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> cartoon=new ArrayList<String>();
		cartoon.add("Doreman");
		cartoon.add("Ben10");
		cartoon.add("nijna");
		cartoon.add("jakechan");
		cartoon.add("motu patulu");
		System.out.println(cartoon);
		cartoon.remove("Doreman");
		System.out.println(cartoon);
		cartoon.add("Doreman");
		System.out.println(cartoon);
		}

}
