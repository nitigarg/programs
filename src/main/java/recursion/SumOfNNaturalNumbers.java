package recursion;

public class SumOfNNaturalNumbers {
    //sum=1+2+3..+n (n*n+1)/2
    public static void printSum(int i, int n, int sum){
        if(i==n){//stop when i becomes equal to n
            sum=sum+i;
            System.out.println("Sum of n natural numbers is "+sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);

    }

    public static void main(String[] args) {
        printSum(1,6,0);
    }
}
