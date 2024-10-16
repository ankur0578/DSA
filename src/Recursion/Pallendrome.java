package Recursion;

public class Pallendrome {
    public static boolean checkPallendrome(String s, int left, int right){
        if(left == right || left > (s.length()-1)/2){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return checkPallendrome(s,left+1,right-1);
    }
    public static void main(String[] args) {
        String s = "1121";
        int left = 0;
        int right = s.length()-1;
        boolean ispallendrome = checkPallendrome(s,left,right);
        if (ispallendrome){
            System.out.println("pallendrome");
        }else {
            System.out.println("not");
        }
    }
}
