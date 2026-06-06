class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
       int cnt1 = 0;
       int cnt2 = 0;
       List<Integer> result = new ArrayList<>(2);
       int element1 = Integer.MIN_VALUE;
       int element2 = Integer.MIN_VALUE;
       for(int i = 0; i< n;i++){
        if(cnt1 == 0 && element2 !=nums[i]){
            cnt1 =1;
            element1 = nums[i];
        }
        else if( cnt2 == 0 && element1 != nums[i]){
            cnt2 = 1;
            element2 = nums[i];
        }
        else if(element1 == nums[i])
        {
            cnt1++;
        }
        else if(element2 == nums[i])
        {
            cnt2++;
        }
        else
        {
            cnt1--;
            cnt2--;
        }
       }
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0;i < n;i++){
            if(element1==nums[i])
            {
                cnt1++;
            }
            else if(element2 == nums[i])
            {
                cnt2++;
            }
        }
        if(cnt1 > n/3){
            result.add(element1);
        }
        if(cnt2 > n/3)
        {
            result.add(element2);
        }
        return result;
    }
}