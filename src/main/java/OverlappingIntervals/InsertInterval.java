package OverlappingIntervals;
import java.util.*;
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        boolean added = false;  // flag to check if newInterval is added

        for (int i = 0; i < intervals.length; i++) {
            int[] current = intervals[i];

            if (current[1] < newInterval[0]) {
                // Current interval is completely before newInterval
                merged.add(current);
            } else if (current[0] > newInterval[1]) {
                // Current interval is completely after newInterval
                if (!added) {
                    merged.add(newInterval);
                    added = true;
                }
                merged.add(current);
            } else {
                // Overlapping intervals → merge
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }

        // If newInterval has not been added yet (comes at the end)
        if (!added) {
            merged.add(newInterval);
        }

        return merged.toArray(new int[merged.size()][]);
    }

}
