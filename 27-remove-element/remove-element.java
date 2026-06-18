class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int end =n-1;
        int i =0;
        while(i<=end){
            if(nums[end] == val){
                end--;
            }
            else if(nums[i]==val && nums[end]!=val){
                int temp = nums[i];
                nums[i]=nums[end];
                nums[end]=temp;
                i++;
                end--;
            }
            else{
                i++;
            }
        }
        return end +1;
    }
}