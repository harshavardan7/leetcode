class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> range = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int start = nums[i];

            while (i + 1 < len && (nums[i] + 1) == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                range.add(start + "->" + nums[i]);
            } else {
                range.add(start + "");
            }

        }
        return range;
    }
}