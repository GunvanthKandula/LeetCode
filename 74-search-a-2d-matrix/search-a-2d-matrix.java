class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(target>matrix[m-1][n-1])return false;
        if(target<matrix[0][0]) return false;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(searchtarget(matrix[mid],target)){
                return true;
            }
            else if(matrix[mid][0]>target){
                high = mid-1;
            }
            else if(matrix[mid][0]<target){
                low=mid+1;
            }
        }    
        return false;
    }
    public boolean searchtarget(int[] row,int target){
        if(target>row[row.length-1]) return false;
        if(target<row[0]) return false;
        int low = 0;
        int high = row.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(row[mid]==target){
                return true;
            }
            else if(target>row[mid]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}