package Recursion;

public class Factorial {
    public long factorialofNos(long N){
        if(N<=1){
            return 1;
        }
        return N * factorialofNos(N-1);
    }

    public static void main(String[] args) {
        Factorial fac = new Factorial();
        System.out.println(fac.factorialofNos(10));
    }
}
