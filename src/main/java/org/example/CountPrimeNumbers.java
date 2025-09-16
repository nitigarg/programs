package org.example;

public class CountPrimeNumbers {
    //Given the range we have to count number of prime numbers

    public int countPrimes(int n){
        int noOfPrimeNumber=0;
        int[] isPrime=new int[n];
        if(n<2){
            return noOfPrimeNumber;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==0){// initially we are assuming that all numbers are prime in the array and marked as 0
               for(int j=i*i;j<n;j+=i){
                  isPrime[j]=1;//marking as one means they are not prime
               }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]==0){
                noOfPrimeNumber++;
            }
        }
        return noOfPrimeNumber;
    }


}
