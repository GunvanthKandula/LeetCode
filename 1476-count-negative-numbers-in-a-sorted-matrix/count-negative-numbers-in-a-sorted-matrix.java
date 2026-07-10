class Solution {
    public int countNegatives(int[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        int rows = m-1;
        int col = 0;
        int cnt = 0;
        while(rows>=0 && col <n){
            if(grid[rows][col]<0){
                cnt+=n-col;
                rows--;
            }else{
              col++;  
            }
        }
        return cnt;
    }
}