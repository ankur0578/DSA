package Array;

public class ConsequtiveNumber {
    public static int findMaxConsecutiveOnes(int[] nums) {
         int count = 0;
         for(int i =0 ; i < nums.length-1 ; i++){
             if(nums[i] == 0){
                 count = 0;
             }else if(nums[i+1] == 1){
                 count++;
             }
         }

         return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
