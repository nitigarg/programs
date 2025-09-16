package MergingProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSorted2DArray {
    //K-way merge using a PriorityQueue, inserting only the first element of each row initially.
    //beacuse input is sorted
    static class StreamEntry{
        private int value;
        private int arrayIndex;
        private int elementIndex;

        public StreamEntry(int value, int arrayIndex, int elementIndex){
            this.arrayIndex=arrayIndex;
            this.value=value;
            this.elementIndex=elementIndex;
        }
    }
    public static int[] sortedPlainArray(int[][] arr) {
        PriorityQueue<StreamEntry> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.value));
        for (int i = 0; i < arr.length;i++) {
            if(arr[i].length>0){
                pq.offer(new StreamEntry(arr[i][0],i,0));
            }
        }
      List<Integer> result=new ArrayList<>();
        while(!pq.isEmpty()){
            StreamEntry current=pq.poll();
            result.add(current.value);
            int nextIndex=current.elementIndex+1;
            if(nextIndex<arr[current.arrayIndex].length){
                int nextValue=arr[current.arrayIndex][nextIndex];
                pq.offer(new StreamEntry(nextValue,current.arrayIndex,nextIndex));
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
