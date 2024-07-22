package Array;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        boolean res = isMonotonic(nums);
        System.out.println(res);
    }
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false; // If any element is greater than the previous, it's not decreasing
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false; // If any element is smaller than the previous, it's not increasing
            }
        }

        return increasing || decreasing;
    }
}
