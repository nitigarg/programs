package Miscellaneous_InterviewPrograms;

public class Factorial {
    public long iterative(int n){
        //factorial=n*n-1*n-2....1;
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public long recursive(int n){
        //base case
        if(n==0){
           return 1;
        }
        return n* recursive(n-1);
    }
}
