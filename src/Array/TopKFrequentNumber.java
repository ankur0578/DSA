package Array;

import java.util.*;

public class TopKFrequentNumber {
    public static void main(String[] args) {
        int[] nums ={1,1,1,2,2,3,3,4,4,4,4};
        int[] res = topKFrequent(nums,3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frquencyMap = new HashMap<>();
        int[] result = new int[k];
        for(int num : nums){
            frquencyMap.put(num ,frquencyMap.getOrDefault(num,0)+1);
        }
        Queue<Integer> minHeap = new PriorityQueue<>(
                (a,b) -> frquencyMap.get(a) - frquencyMap.get(b)
        );

        for(int num : frquencyMap.keySet()){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        for(int i = 0 ; i< k ;i++){
            result[i] = minHeap.poll();
        }

        return  result;
    }
}
