class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> present = new HashSet<>();
        for(int i = 0;i<n;i++){
            present.add(nums[i]);
        }
        for(int i = 0;i<n;i++){
            if(!present.contains(i)){
                return i;
            }
        }
        return n;
    }
}