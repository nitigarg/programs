package Monotonic;

import java.util.Stack;

public class NextGreaterElement {
    /*
    * Input: arr = [4, 5, 2, 10, 8]
          Output:      [5,10,10,-1,-1]*/

    public static int[] nextGreaterElement(int[] nums){
        int[] result=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        //for greater element traverse from right most side
        stack.push(nums[nums.length-1]);
        result[nums.length-1]=-1;
        for(int i=nums.length-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();

            }
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
