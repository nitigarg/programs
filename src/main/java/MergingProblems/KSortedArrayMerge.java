package MergingProblems;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class KSortedArrayMerge {
    public static void main(String args[]){
        int arr[]={2,3,45,67,1};
        //we have to sort this array using priority Queue and stream
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Arrays.stream(arr).forEach(pq::offer);
        int[] sortedArray= IntStream.range(0,arr.length).map(i->pq.poll()).toArray();
        System.out.println(Arrays.toString(sortedArray));
    }
}
