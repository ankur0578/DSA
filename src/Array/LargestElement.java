package Array;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr = {1,4,3,6,8};
        int max = arr[0];
        for (int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
