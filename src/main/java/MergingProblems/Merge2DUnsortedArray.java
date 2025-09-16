package MergingProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Merge2DUnsortedArray {
    //given int[][] input = {
//    {3, 5, 1},
//    {9, 2},
//    {8, 6, 4}
//};
//Return sorted array {1,2,3,4,5,6,8,9,}
public static int[] sortedFlatArray(int[][] arr){
    class StreamEntry{
        private int value;
        public StreamEntry(int value){
            this.value=value;
        }
    }
    PriorityQueue<StreamEntry>pq=new PriorityQueue<>(Comparator.comparingInt(a->a.value));
    for(int[] row:arr){
        for(int j:row){
            pq.offer(new StreamEntry(j));
        }
    }
    List<Integer> list=new ArrayList<>();
    while(!pq.isEmpty()){
        list.add(pq.poll().value);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
}
}
