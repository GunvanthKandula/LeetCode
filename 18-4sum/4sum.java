class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                Set<Long> st = new HashSet<>();
                for(int k = j+1;k<n;k++){
                    long fourth = (long)target-nums[i] - nums[j] - nums[k];
                    if(st.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    st.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}