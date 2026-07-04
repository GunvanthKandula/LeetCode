class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int[] missing = new int[2000];
        int index = 0;
        for(int i = 1;i<=2000;i++){ 
            if(find(arr,i)==false && missing.length!=k){
                missing[index++]=i;
            }
        }
        return missing[k-1];
    }
    public boolean find(int[] arr,int i){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                return true;
            }
        }
        return false;
    }
}