class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n ==1){
            return nums[0];
        }
        long maxproduct = 0;
        for(int i = 0;i<n;i++){
            long product =1;
            for(int j =i;j<n;j++){
                product*=nums[j];
                maxproduct = Math.max(maxproduct,product);
            }
        }
    return (int)maxproduct;
    }
}