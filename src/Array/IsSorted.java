package Array;

public class IsSorted {
    public static void main(String[] args) {
        int [] arr =  new int[]{3,1,2,3,1,2};
        boolean isorted = true;
        for(int i = 1; i < arr.length -2 ;i++){
            if(arr[i] >= arr[i-1]){

            } else if(arr[i+1] >= arr[i]){

            }else{
                isorted = false;
            }
        }
        System.out.println(isorted);
    }
}
