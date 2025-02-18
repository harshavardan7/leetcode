class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> greater = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!deque.isEmpty()) {
                int idx = deque.getLast();
                int val = nums2[idx];

                if (val >= nums2[i])
                    break;
                
                greater.put(val, nums2[i]);
                deque.pollLast();
            }

            deque.addLast(i);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++)
            res[i] = greater.getOrDefault(nums1[i], -1);
        
        return res;
    }
}