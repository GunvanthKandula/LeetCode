class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int cnt =0 ;
        int prefix = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i = 0;i<n;i++){
            prefix += nums[i];
            int remove = prefix -k;
            cnt = cnt + mpp.getOrDefault(remove,0);
            mpp.put(prefix,mpp.getOrDefault(prefix,0)+1);
        }
        return cnt;
    }
}