class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=0;
        List<List<Integer>> arr=new  ArrayList<>();
        if(target<0 && nums[0]>0)return new ArrayList<>();
        while(a<n-3){
            if(a>0 && nums[a]==nums[a-1]){
                a++;
                continue;
            }
            int b=a+1;
            while(b<n-2){
               if (b>a+1 && nums[b] == nums[b-1]) {
                    b++;
                    continue;
                }
                int c = b+1;
                int d = n-1;
                while(c<d){
                    long total = nums[a]+nums[b]+nums[c]+nums[d];
                    if(total>target){
                        d--;
                    }
                    else if(total<target){
                        c++;
                    }
                    else{
                        arr.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        while (nums[c] == nums[c-1] && c < d) {
                            c++;
                        }
                    }
                }
                b++;
            }
            a++;
        }
        return arr;
    }
}