class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int cnt = 1, maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;        // skip duplicates
            else if (nums[i] == nums[i - 1] + 1) cnt++;  // consecutive
            else cnt = 1;                                 // reset
            maxLen = Math.max(maxLen, cnt);
        }
        return maxLen;
    }
}