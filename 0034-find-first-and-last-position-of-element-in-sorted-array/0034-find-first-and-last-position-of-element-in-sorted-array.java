class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[]{-1,-1};
        int n = nums.length;
        int low = 0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                high = mid-1;
                if(nums[mid]==target){
                    index[0]=mid;
                }
            }
            else{
                low = mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                index[1]=mid-1;
                high = mid-1;
            }
            else{
                if (nums[mid] == target) index[1] = mid;
                low=mid+1;
            }
        }
        if(index[0] == -1){
            return new int[]{-1,-1};
        }
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna