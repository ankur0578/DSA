package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2,2,9,6};
        int largest = arr[0];
        int secondLargest  = -1;

        for(int i = 1 ; i< arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secondLargest ) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
