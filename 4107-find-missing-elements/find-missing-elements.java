class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       Set<Integer> present = new HashSet<>();
       List<Integer> missing = new ArrayList<>();
       for(int i = 0;i<nums.length;i++){
        min = Math.min(nums[i],min);
        max = Math.max(nums[i],max);
        present.add(nums[i]);
       } 
       for(int i = min;i<=max;i++){
        if(!present.contains(i)){
            missing.add(i);
        }
       }
       return missing;
    }
}