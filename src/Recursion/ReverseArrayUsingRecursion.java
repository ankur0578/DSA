package Recursion;

public class ReverseArrayUsingRecursion {
    public static void reverse(int[] arr , int left , int right){
        System.out.println("calling this");
        if(left == right){
            return;
        }
        swap(left, right, arr);
        reverse(arr, left+1,right-1);
    }

    public static void swap(int left, int right, int[]arr){
        int temp = arr[right];
        arr[right]=arr[left];
        arr[left]= temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int left = 0;
        int right = arr.length-1;
        reverse(arr, left, right);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
