package Array;

public class ProductExceptItself {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] res = productExceptSelf(nums);
        for(int i : res){
            System.out.println(i);
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        answer[0]=1;
        for(int i = 1; i < nums.length ; i++){ //left product
             answer[i] = answer[i-1] * nums[i-1];
        }
        int rightProduct = 1;
        for(int i = nums.length -1; i >= 0; i--){
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}
