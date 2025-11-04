package OverlappingIntervals;

import java.util.*;

public class MergeIntervals {
    //leetcode problem 56
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0){
            return new int[0][];
        }
        List<int[]> merged=new ArrayList<>();
        //sorting with start time
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(current[1]>=intervals[i][0]){
                //then overlapping
                current[1]=Math.max(current[1],intervals[i][1]);
            }else{
                //adding in list
                merged.add(current);
                current=intervals[i];
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}
