package recursion.advanced;

public class PlaceTiles {
    //place 1xm tiles in nxm floor
    public static int placeTiles(int n, int m){
        //base case
        //when n=m we can either place horizontal or vertical then 2 ways return 2
        //when n<m we can only place horizontally i.e. 1

        if(n==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }
        //place tiles vertically
            int verticalPlacements=placeTiles(n-m,m);
            //horizontally
        int horizontalPlacements=placeTiles(n-1,m);
        return verticalPlacements+horizontalPlacements;

    }

}
