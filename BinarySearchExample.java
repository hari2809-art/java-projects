package demo;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 8, 9};
        int target = 8;
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (nums[mid] == target) {
                System.out.println("Found " + target + " at index " + mid);
                found = true;
                break;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }

        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
