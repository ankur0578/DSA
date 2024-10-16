package Array;

//for sort color

public class TwoSumsTwo {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i : nums){
            System.out.println(i);
        }

    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                // Swap nums[low] and nums[current]
                int temp = nums[low];
                nums[low] = nums[current];
                nums[current] = temp;
                low++;
                current++;
            } else if (nums[current] == 1) {
                // Move the current pointer ahead
                current++;
            } else {
                // Swap nums[high] and nums[current]
                int temp = nums[high];
                nums[high] = nums[current];
                nums[current] = temp;
                high--;
            }
        }

    }

    public static void swap(int[] nums , int right, int left){
        int temp = nums[right];
        nums[right]= nums[left];
        nums[left]=temp;
    }

}
