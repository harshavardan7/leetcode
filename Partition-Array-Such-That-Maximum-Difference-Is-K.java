class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int a=1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-min>k){
                a++;
                min=nums[i];
            }
        }
        return a;
    }
}