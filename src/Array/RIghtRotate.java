package Array;

public class RIghtRotate {
    public static void rotate(int[] nums, int k) {
       reverseArray(nums,0,nums.length-1);
       reverseArray(nums,0,k-1);
       reverseArray(nums,k,nums.length-1);
    }

    public static void reverseArray(int[] nums , int from , int end){
        if(from >= end){
            return;
        }
            //int temp;
            while (from < end){
                int temp = nums[end];
                nums[end] = nums[from];
                nums[from] = temp;
                from++;
                end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for(int i : nums){
            System.out.println(i);
        }
    }
}
