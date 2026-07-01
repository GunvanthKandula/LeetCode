class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1;
       int high = max(piles);
       long totalhrs = 0; 
       while(low<=high){
            int mid = (low+high)/2;
            totalhrs = totalHours(piles,mid);
            if(totalhrs > h){
            low = mid +1;
            }
            else if(totalhrs <= h){
            high = mid - 1;
            }
       }
       return low;
    }
    public long totalHours(int[] piles,int mid){
        long result = 0;
        for(int i = 0;i<piles.length;i++){
            result += (long)Math.ceil((double)piles[i]/mid);
        }
        return result;
    }
    public int max(int[] piles){
        int max =Integer.MIN_VALUE;
        for(int pile : piles){
            if(pile > max){
                max = pile;
            }
        }
        return max;
    }
}