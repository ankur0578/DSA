package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums  = new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = 0;
        for(int j = 1 ; j < nums.length;j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        System.out.println(i+1);

    }
}
