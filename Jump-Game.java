class Solution {
    public boolean canJump(int[] nums) {
        int re=0;
        for(int i=0;i<nums.length;i++){
            if(i>re) return false;
            re=Math.max(re,i+nums[i]);
        }
        return true;
    }
}