class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new  ArrayList<>();
        helper(nums,0,temp);
        return result;
    }
    public void helper(int[]nums,int idx,List<Integer> temp){
        if(idx==nums.length){
            result.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[idx]);
        helper(nums,idx+1,temp);

        temp.remove(temp.size()-1);
        helper(nums,idx+1,temp);
    }
}
