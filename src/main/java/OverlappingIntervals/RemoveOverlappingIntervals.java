package OverlappingIntervals;
import java.util.*;
public class RemoveOverlappingIntervals {
/*Memory Tricks / Patterns
Problem Type	Sort By	Rule / Greedy Choice	Key Analogy
Merge overlapping	start	Merge if overlaps	Stretch rubber band
Keep non-overlapping / remove overlap	end	Keep earliest end, remove overlap	Schedule maximum meetings

Quick tip:

Merging = combine overlapping intervals → sort by start

Non-overlapping = maximize kept intervals → sort by end
* */

    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        if(intervals==null || intervals.length==0){
            return count;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int [] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(current[1]>intervals[i][0]){
                count++;
            }
            else{
                current=intervals[i];
            }
        }
        return count;
    }
}
