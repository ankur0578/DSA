package Hashing;

import java.util.Scanner;

public class HashingMain {
    public static void main(String[] args) {
        System.out.println("Enter Size of a array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array values");
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        FirstHashing hs = new FirstHashing();
        hs.search(arr,sc);
        System.out.println("program ended");
    }

}
