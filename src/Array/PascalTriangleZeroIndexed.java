package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleZeroIndexed {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> res = generate(rowIndex);
        System.out.println(res.toString());
    }

    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> preRow = new ArrayList<>();
        preRow.add(1);
        triangle.add(preRow);
        if(rowIndex < 1){
            return preRow;
        } if(rowIndex == 1){
            preRow.add(1);
            return  preRow;
        }
        for(int i=1 ; i<=rowIndex; i++){
            List<Integer> previousRow = triangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 1; j < i; j++){
                currentRow.add(previousRow.get(j-1) + previousRow.get(j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return  triangle.get(rowIndex);
    }
}
