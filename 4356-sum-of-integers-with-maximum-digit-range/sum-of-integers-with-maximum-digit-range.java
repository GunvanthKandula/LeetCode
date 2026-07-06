class Solution {
    public int maxDigitRange(int[] nums) {
       int maxRange = 0;
        for(int x : nums){
            maxRange = Math.max(maxRange,digitrange(x));
        }
        int sum = 0;
        for(int x :nums){
            if(digitrange(x)==maxRange){
                sum+=x;
            }
        }
        return sum;
    }
    public int digitrange(int n){
        int min = 9;
        int max =0;
        int temp = 0;
        if(n==0)return 0;
        while(n>0){
            temp = n%10;
            min = Math.min(min,temp);
            max = Math.max(max,temp);
            n=n/10;
        }
        return max - min;
    }
}