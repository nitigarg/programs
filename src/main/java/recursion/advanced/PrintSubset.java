package recursion.advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubset {
    static void printSubset(int n, ArrayList<Integer> subset){
        if(n<=0){
            System.out.println(subset);
            return;
        }
        //when we are adding element in subset
        subset.add(n);
        printSubset(n-1,subset);
        //when we are not adding element in subset
        subset.remove(subset.size()-1);
        printSubset(n-1,subset);
    }

    public static void main(String[] args) {
        int n=3;
        printSubset(3,new ArrayList<Integer>());
    }
}
