package Sorting;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            int j =i;
            while (j > 0 && arr[j-1] > arr[j]){
                swap(arr ,j-1, j);
                j--;
            }
        }
    }

    public static void swap(int[] arr ,int min, int  j){
        int temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,24,2,54,6,52};

        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
