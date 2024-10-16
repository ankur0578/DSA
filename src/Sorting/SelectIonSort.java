package Sorting;

public class SelectIonSort {
    public static void sort(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            int min  = i;
            for(int j = i ; j <= arr.length-1;j++){
                if(arr[j] < arr[min]){
                    swap(arr , min,j);
                }
            }
        }
    }

    public static void swap(int[] arr ,int min, int  j){
        int temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,6,2};

        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
