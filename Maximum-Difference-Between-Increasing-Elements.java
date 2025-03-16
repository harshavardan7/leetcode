class Solution {
    public int maximumDifference(int[] nums) {
        int a=Integer.MAX_VALUE;
        int maxDiff=-1;
        for(int i=0;i<nums.length;i++){
            if(a<nums[i]){
                int p=nums[i]-a;
                maxDiff=Math.max(maxDiff,p);
            }
            else{
                a=nums[i];
            }
        }
        return maxDiff;
    }
}