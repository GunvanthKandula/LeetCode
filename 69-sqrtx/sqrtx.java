class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        int ans = 0;
        while(low<=high){
            long mid = (low+high)/2;
            long val= (long)mid*(long)mid;
            if(val==x){
                return (int)mid;
            }
            else if(val>x){
                high = mid-1;
            }
            else{
                low = mid + 1;
                ans = (int)mid;
            }
        }
        return ans;
    }
}