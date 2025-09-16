package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1) ;
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a, b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] result=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            result[i++]=pq.poll().getKey();
        }
        return result;
    }
}
