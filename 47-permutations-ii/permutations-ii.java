class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurpermute(nums,ans,ds,freq);
        return new ArrayList<>(ans);
    }
    public void recurpermute(int[] arr, Set<List<Integer>> anss,List<Integer> DS,boolean[] freq){
        if(DS.size() == arr.length){
            anss.add(new ArrayList<>(DS));
            return;
        }
        for(int i = 0;i < arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                DS.add(arr[i]);
                recurpermute(arr,anss,DS,freq);
                DS.remove(DS.size() - 1);
                freq[i]=false;
            }
        }
    }
}/// solve Later using hash set slight modification think deeep