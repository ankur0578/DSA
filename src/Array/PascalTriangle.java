package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> res = generate(numRows);
        System.out.println(res.toString());

    }
    public static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> triangle = new ArrayList<>();
       List<Integer> preRow = new ArrayList<>();
       preRow.add(1);
       triangle.add(preRow);
       if(numRows <= 1){
          return triangle;
       }
       for(int i=1 ; i<numRows; i++){
           List<Integer> previousRow = triangle.get(i-1);
           List<Integer> currentRow = new ArrayList<>();
           currentRow.add(1);
           for(int j = 1; j < i; j++){
               currentRow.add(previousRow.get(j-1) + previousRow.get(j));
           }
           currentRow.add(1);
           triangle.add(currentRow);
       }
       return  triangle;
    }
}
