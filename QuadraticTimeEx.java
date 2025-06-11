package demo;

public class QuadraticTimeEx {
	public static void main(String[] args) {
		int[] nums= {1,3,5,7,3};
		boolean hasduplicate=false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					hasduplicate=true;
					System.out.println("Duplicate found:"+nums[i]);
				}
			}
		}
		if(!hasduplicate) {
			System.out.println("no duplicate found");
		}

	}

}
