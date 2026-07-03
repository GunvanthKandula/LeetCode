class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        long low =0;
        long high = 0;
        for(int i = 0;i<n;i++){
            low = Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            long mid = (low+high)/2;
            int noofdays = howManyDays(weights,(int)mid);
            if(noofdays<=days){
                high = mid - 1;
            }
            else{
                low = mid +1;
            }   
        }
        return (int)low;
    }
    public int howManyDays(int[] weights,int capacity){
        int load = 0;
        int days = 1;
        for(int i = 0;i<weights.length;i++){
           if((load+weights[i]) > capacity){
            days++;
            load = 0;
           }
           load+=weights[i];
        }
        return days;
    }
}