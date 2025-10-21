package Miscellaneous_InterviewPrograms;

public class Fibonacci {
    public void fib(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
