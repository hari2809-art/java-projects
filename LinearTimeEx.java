package demo;

public class LinearTimeEx {
	public static void printAllElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element"+i+":"+arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		printAllElements(nums);

	}

}
