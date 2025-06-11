package demo;

public class ConstantTimeEx {
	public static void printFirstElement(int [] arr) {
		if(arr.length>0) {
			System.out.println("First element is:"+arr[3]);
		}else {
			System.out.println("Array is empty");
		}
	}
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50,60,70,80,90,100};
		printFirstElement(nums);
	}

}
