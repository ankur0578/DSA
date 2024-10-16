package Array;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.println(num);
        }
    }
    public static void sortColors(int[] nums) {
        int left = 0;
        for (int i = 1 ;i < nums.length-1;i++){
            if(nums[i] == 0 ){
                left ++;
            } else if (nums[i] == 1 && nums[i-1] < 1){
                swap(nums ,i,i-1);
            } else if (nums[i] == 2 && nums[i-1] < 2){
                swap(nums ,i,i-1);
            }
        }
    }

    public static void swap(int[] nums , int right, int left){
         int temp = nums[right];
         nums[right]= nums[left];
         nums[left]=temp;
    }
}
