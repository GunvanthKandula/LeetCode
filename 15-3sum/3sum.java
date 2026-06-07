class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(st.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                st.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}