package FastAndSlowPointerPatterns;

public class HappyNumberWithSLowAndFastPointer {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getSumOfSquareOfDigits(n);
        while(fast!=1 && slow!=fast){
            slow=getSumOfSquareOfDigits(slow);
            fast=getSumOfSquareOfDigits(getSumOfSquareOfDigits(fast));
        }
        return fast==1;
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
