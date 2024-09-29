package Recursion;

public class SumOfN {
    public int sumNos(int N)
    {
        if(N == 0){
            return 0;
        }
        return N +  sumNos(N-1);
    }
    public static void main(String[] args) {
        SumOfN n = new SumOfN();
        System.out.println( n.sumNos(3));
    }
}
