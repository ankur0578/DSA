package Recursion;
/*
 a function calling itself is recursion
 */

public class OneToN {
    public void printNos(int N)
    {
        if(N == 0){
            return;
        }
        printNos(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        OneToN n = new OneToN();
        n.printNos(64);
    }
}
