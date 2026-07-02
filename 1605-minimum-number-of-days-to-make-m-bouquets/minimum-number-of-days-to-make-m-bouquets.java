class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
    int n = bloomDay.length;
    long notpossible = (long)m*(long)k;
    if(notpossible>n){
        return -1;
    }
    int minDay =Integer.MAX_VALUE;
    int maxDay = Integer.MIN_VALUE;
    for(int b=0;b<n;b++){
        minDay =Math.min(minDay,bloomDay[b]);
        maxDay = Math.max(maxDay,bloomDay[b]);
    }
    long low = minDay;
    long high = maxDay;
    int day = 0;
    while(low<=high){
        long mid = (low+high)/2;
        if(canMake(bloomDay,(int)mid,m,k)>=m){
            high = mid-1;
            day =(int) mid;
        }
        else{
            low = mid +1;
        }
    }
    return day;
    }
    public int canMake(int[] bloomDay,int day,int m,int k){
        int bouquets = 0;
        int cnt = 0;
        for(int i =0;i<bloomDay.length;i++){

            if(bloomDay[i]<=day){
                cnt++;
                if(cnt==k){
                    bouquets++;
                    cnt=0;
                }
            }
            else{
                cnt =0;
            }
        }
        return bouquets;
    }
}