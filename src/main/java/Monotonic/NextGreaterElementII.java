package Monotonic;

import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i%n]>=stack.peek()){
                stack.pop();
            }
            result[i%n] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i%n]);
        }
        return result;
    }
}
