package java_with_dsa;
import java.util.*;
public class lists {

	public static void main(String[] args) {
		ArrayList<String> mobilePhones=new ArrayList<String>();
		mobilePhones.add("iqoo neo6");
		mobilePhones.add("moto edge18");
		mobilePhones.add("redmi 13c");
		mobilePhones.add("vivo t3");
		Collections.sort(mobilePhones);
		for(int i=1;i<mobilePhones.size();i++)
			System.out.println(mobilePhones.get(i));
	}
}
