class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int n = nums.length;
     int cnt = 0 ;
     int len = n/3;
     List<Integer> ans = new ArrayList<>();
     for(int i = 0; i< n ;i++){
        int cur = nums[i];
        if(!ans.contains(cur)){
        for(int j = 0; j< n ;j++){
            if(nums[j]==cur){
                cnt++;
            }
        }
        }
        if(cnt > len){
            ans.add(cur);
        }
        cnt = 0;
     }
     return ans;
    }
}