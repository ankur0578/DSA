package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeSequence {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] res = rearrangeArray(nums);
        for(int i : res){
            System.out.println(i);
        }

    }

    public static int[] rearrangeArray(int[] nums) {
       int[] res = new int[nums.length];
       int posIndex = 0;
       int negIndex = 1;
        for(int i : nums){
            if(i <  0){
                res[negIndex] = i;
                negIndex +=2;
            }else {
                res[posIndex] = i;
                posIndex +=2;
            }
        }
        return res;
    }
}
