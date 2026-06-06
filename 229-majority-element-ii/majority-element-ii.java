class Solution {
    public List<Integer> majorityElement(int[] nums) {
     int n = nums.length;
     int len = n/3;
     List<Integer> ans = new ArrayList<>();
     HashMap<Integer,Integer> mpp = new HashMap<>();
     for(int i = 0 ; i<n ; i++){
        mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
     }
     for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) { 
            if (entry.getValue() > n / 3) {
                ans.add(entry.getKey());
            }
        }
     return ans;
    }
}