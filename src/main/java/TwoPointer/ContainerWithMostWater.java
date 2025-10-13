package TwoPointer;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            if(maxArea<area){
                maxArea=area;
            }
            //we will move towards shorter line
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
