class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];
        for(int i =0 ; i<n ;i++){
            freq[nums[i]]++;
        }
        for( int num =0 ; num < freq.length;num++){
            if(freq[num] > 1)
            return num;
        }
        return -1;
    }
}