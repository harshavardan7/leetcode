class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int max=0;
       while(left<right){
        int w=right-left;
        int h=Math.min(height[left],height[right]);
        int water=w*h;
        max=Math.max(max,water);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return max;
    }
}