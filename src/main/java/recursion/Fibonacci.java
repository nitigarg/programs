package recursion;

public class Fibonacci {
public static void fib(int a, int b, int n){
    if(n==0){
        return;
    }
    int next=a+b;
    System.out.print(next+" ");
    fib(b,next,n-1);
}
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        fib(0,1,n-2);
    }
}



