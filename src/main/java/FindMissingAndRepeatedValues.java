import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set=new HashSet<>();
        int ans[]=new int[2];
        int expectedSum=0;
        int actualSum=0;
        int missingNum=-1; int repeatedNum=-1;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                actualSum+=grid[i][j];
                if(set.contains(grid[i][j])){
                    repeatedNum=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        //here it is given that array will have numbers from 1 to n^2 where n is sixe of array or grid
        expectedSum=(n*n)*((n*n)+1)/2; // sum of n natural numbers is n*(n+1)/2
        missingNum=expectedSum+repeatedNum-actualSum;
        ans[0]=repeatedNum; ans[1]=missingNum;
        return ans;
    }
}
