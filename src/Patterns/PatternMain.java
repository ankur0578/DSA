package Patterns;

import java.util.Scanner;

public class PatternMain {

    public static void patter1(Scanner sc){
        System.out.println("enter rows");
        int n = sc.nextInt();
        System.out.println("enter column");
        int m = sc.nextInt();
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 0; i < n;i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 1; i <= n;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 1; i <= n;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = n; i >0;i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = n; i >0;i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();
        pattern6(n);
    }
}
