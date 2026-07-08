class Solution {
    public int splitArray(int[] nums, int k) {
       int n = nums.length;
       if(n<k)return -1;
       long low = 0;
       for(int i = 0;i<n;i++){
        low = Math.max(nums[i],low);
       } 
       long high = 0;
       for(int i = 0;i<n;i++){
        high+=nums[i];
       }
       while(low<=high){
          long mid = low +(high-low)/2;
           if(doSplit(nums,mid)<=k){
            high = mid-1;
           }
           else{
            low = mid+1;
           }
       }
       return (int)low;
    }
    public int doSplit(int[] nums,long sum){
        int cnt = 1;
        int lastpos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]+lastpos<=sum){
                lastpos+=nums[i];
            }
            else{
                cnt++;
                lastpos=nums[i];
            }
        }
      return cnt;  
    }
}