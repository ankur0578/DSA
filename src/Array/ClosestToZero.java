package Array;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] nums = new int[]{-100000,-100000};
        System.out.println("closes number " + findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
      int closet = nums [0];
      for(int num : nums){
          if(Math.abs(num) < Math.abs(closet)){
              closet = num;
          }
      }

      if(closet < 0 && contains(closet , nums)){
          return Math.abs(closet);
      } else {
          return closet;
      }
    }

    public static boolean contains (int x , int[] nums){
        for (int num : nums){
            if(num == Math.abs(x)){
                return  true;
            }
        }
        return false;
    }
}
