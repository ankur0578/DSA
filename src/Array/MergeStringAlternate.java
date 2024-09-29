package Array;

public class MergeStringAlternate {
    public static void main(String[] args) {
        System.out.println("result string = " + mergeAlternately("abc","pqr"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int length;
        if(word1.length() > word2.length()){
            length = word1.length();
        } else {
            length = word2.length();
        }
        String resultString = "";
        for(int i = 0 ; i < length ; i ++){
            if(word1.length() > word2.length()){
               if(word1.length() >i){
                   resultString = resultString + word1.charAt(i) + word2.charAt(i+1);
               } else {
                   resultString = resultString + word1.charAt(i);
               }
            } else if(word2.length() > word1.length()){
                if(word2.length() >i){
                    resultString = resultString + word2.charAt(i) + word1.charAt(i+1);
                } else {
                    resultString = resultString + word2.charAt(i);
                }
            }
        }

   return resultString;
    }
}
