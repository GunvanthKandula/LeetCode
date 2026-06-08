class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int low = j+1;
                int high = n-1;
                while(low<high){
                    long sum = (long) nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum < target){
                        low++;
                    }
                    else if(sum > target){
                        high--;
                    }
                    else{
                        List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[low],nums[high]);
                        Collections.sort(temp);
                        ans.add(temp);
                        low++;
                        high--;
                        while(low < high && nums[low]== nums[low -1]){
                            low++;
                        }
                        while(low < high && nums[high]== nums[high+1]){
                            high--;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}