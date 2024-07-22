package Array;

import java.util.ArrayList;
import java.util.List;

public class GoodPair {
    public static void main(String[] args) {
      int[] nums = {1,2,3,1,1,3};
      int res = numIdenticalPairs(nums);
      System.out.println(res);
    }

    public static int numIdenticalPairs(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    list.add(i);
                    list.add(j);
                    list1.add(list);
                }
            }
        }
        return list1.size();
    }
}
