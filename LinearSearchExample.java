package demo;
public class LinearSearchExample {
    public static void main(String[] args) {
        int[] nums = {3, 8, 2, 9, 7, 5};
        int target = 7;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
