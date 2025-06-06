package xyz;
import java.util.*;
public class BubblesortExample {
	public static void main(String[] args) {
		int[] nums= {5,2,4,1,3};
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;	
			}
		}
	}
	System.out.println("Sorted list");
	for(int num:nums) {
		System.out.println(num+" ");
	}
}
}
