class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        long low =(long)max(weights);
        long high = (long)totalSum(weights);
        int result = 0;
        while(low<=high){
            long mid = (low+high)/2;
            int ans = howManyDays(weights,(int)mid);
            if(ans<=days){
                result = (int)mid;
                high = mid - 1;
            }
            else if(ans>days){
                low = mid +1;
            }
            
        }
        return result;
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
    public int max(int[] weights){
        int maxi = 0;
        for(int i =0;i<weights.length;i++){
            maxi=Math.max(maxi,weights[i]);
        }
        return maxi;
    }
    public int totalSum(int[] weights){
        int result = 0;
        for(int i : weights){
            result +=i;
        }
        return result;
    }
}