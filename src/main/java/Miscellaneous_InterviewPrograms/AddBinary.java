package Miscellaneous_InterviewPrograms;

public class AddBinary {
    public String addBinary(String a, String b) {
        //we will take StringBuilder for storing result
        StringBuilder result=new StringBuilder();
        //then we will take two pointers or index from rightmost of two strings
        //as we want to iterate from reight to left thats how we do sum
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;//initially there will be no carry at first
        while(i>=0||j>=0||carry!=0){//we will go through loop if any one is true and if all are false we exit
      //two given strings can be of different length and for one of them either i and j can be <0
      //so we will make sure in that case we takes digits as zero
      int digitA=(i>=0)?a.charAt(i)-'0':0;     //this lines says if i is greater than or equal to zero then
      //take that digits as it is but if it is less than zero then take 0
      //first operation in ternary operator is to find the digit from character which can be done by subtracting value of zero
      int digitB=(j>=0)?b.charAt(j)-'0':0;
      int sum=digitA+digitB+carry;
      result.append(sum%2);
      carry=sum/2;
      i--;
      j--;
        }
        return result.reverse().toString();
    }
}
