package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
     return new int[]{0,0};
    }

    public static void main(String[] args) {

        int [] nums = {3,3};
        int [] res = twoSum(nums,6);
        for(int i : res){
            System.out.println(i);
        }

    }
}
