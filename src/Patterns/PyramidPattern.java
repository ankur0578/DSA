package Patterns;

import java.util.Scanner;

public class PyramidPattern {
    public static void pyramidPattern1(int n){
        for(int i = 0; i<n;i++){
            //space
            for (int j =n-i-1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramidPattern1(n);
    }
}
