package MergingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode56MergeOverlappingIntervals {
    //In these kind of problems we should always sort based on start time
    //and the always compare last element of current interval with first element of next interval
    //if first element of next interval<=last element of current interval then they are overlapping

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                //then we can merge
                current[1]=Math.max(intervals[i][1],current[1]);
            }
            else{
                merged.add(current);
                current=intervals[i];
            }
        }
        //adding last interval
        merged.add(current) ;
        return merged.toArray(new int[merged.size()][]);
    }
}
