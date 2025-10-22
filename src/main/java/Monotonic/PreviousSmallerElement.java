package Monotonic;

import java.util.Stack;

public class PreviousSmallerElement {
    /*Input:  [4, 5, 2, 10, 8]
Output: [-1, 4, -1, 2, 2]
    * */
    public static int[] previousSmallerELement(int[] nums){
        int[] result=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]<=stack.peek()){
                stack.pop();
            }
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
