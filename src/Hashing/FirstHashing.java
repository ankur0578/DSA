package Hashing;
/*
  we will fetch element using hash
 */

import java.util.HashMap;
import java.util.Scanner;

public class FirstHashing {

    public static void createHashSet(HashMap has, int[] arr){
        for(int i: arr){
            if(has.containsKey(i)){
                has.put(i, (Integer)has.get(i) + 1);
            }else{
                has.put(i , 1);
            }
        }
    }


    public static void search(int[] arr, Scanner sc){
        System.out.println("Number of operation" );
        int op = sc.nextInt();
        HashMap<Integer,Integer> has = new HashMap<>();
        createHashSet(has, arr);
        while (op != 0){
            System.out.println("enter number");
            int num = sc.nextInt();
            int res  = has.get(num) != null ? has.get(num) : 0;
            System.out.println("Number or occurence " + res);
            op-=1;
        }

    }

}

