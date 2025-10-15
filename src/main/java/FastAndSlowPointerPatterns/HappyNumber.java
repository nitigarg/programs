package FastAndSlowPointerPatterns;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=getSumOfSquareOfDigits(n);
        }
        return true;
    }
    private int getSumOfSquareOfDigits(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return sum;
    }
}
