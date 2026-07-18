class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxi1 = nums[0];
        int ans = Integer.MIN_VALUE;
        for(int i = k;i<n;i++){
            maxi1=Math.max(maxi1,nums[i-k]);
            ans = Math.max(ans,maxi1+nums[i]);
        }
        return ans;
    }
}