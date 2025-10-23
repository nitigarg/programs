package Monotonic;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<Integer>();
        int[] result=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            result[i]=stack.isEmpty()?0:stack.peek();
            stack.push(i);
        }
        for(int i=temperatures.length-1;i>=0;i--){
            result[i]=result[i]-i;
            if(result[i]<0){
                result[i]=0;
            }
        }
        return result;
    }
}
