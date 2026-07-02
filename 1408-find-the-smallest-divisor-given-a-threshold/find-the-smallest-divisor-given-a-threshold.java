class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxii = max(nums);
        int ans = 0;
        int low = 1;
        int high = maxii;
        while(low<=high){
            int mid =(low+high)/2;
            long val = div(nums,mid);
            if(val>threshold){
                low = mid +1;
            }
            else{
                high = mid -1;
                ans = mid;
            }
        }
    return ans;
    }
    public long div(int[] nums,int divisor){
        long result = 0;
        for(int i = 0;i<nums.length;i++){
            result+=(long)Math.ceil((double)nums[i]/divisor);
        }
        return result;
    }
    public int max(int[] nums){
        int maxi =Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}