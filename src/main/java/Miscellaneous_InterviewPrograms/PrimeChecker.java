package Miscellaneous_InterviewPrograms;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;//0,1 are not prime
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
