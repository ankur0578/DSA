package Sorting;

public class BubbleSort {
    public static void sort(int[] arr){
        for(int i = arr.length ; i >=1; i--){
            int counter=1;
            int didSwap = 0;
            for(int j = 0;j < i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr , j,j+1);
                    didSwap =1;
                }
            }
            if(didSwap == 0) {
                break;
            }
            System.out.println("loop running "+counter);
            counter +=1;
        }
    }

    public static void swap(int[] arr ,int min, int  j){
        int temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6};

        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
