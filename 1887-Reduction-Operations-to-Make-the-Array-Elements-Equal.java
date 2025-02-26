class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int o=0;
        int p=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if (nums[i] == p) continue;

            if (nums[i] < p) {
                o += nums.length - 1 - i;
            }

            p = nums[i];
        }

        return o;        
    }
}