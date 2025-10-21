package Miscellaneous_InterviewPrograms;

public class ArmStrongNumbers {
    //number whose each digit raised to power of number of digits in that number and sum of them
    //is equal to that number
    public boolean isArmstrong(int num) {
        //example 153
        //first loop to calculate number of digits in number
        int count = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10; //153/10=15->15/10->1,1/10=0
            count++;
        }
        int sum = 0;
        int compareNum = num;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit , count);
            //math.pow() function return double so casting to int is required
            num = num / 10;
        }
        if (sum == compareNum) {
            return true;
        }
return false;
    }
}
