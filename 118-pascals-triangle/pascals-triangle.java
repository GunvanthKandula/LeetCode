class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();


     for(int row = 1; row <= numRows; row++){
           List<Integer> temp = new ArrayList<>();
            for(int col = 1; col <= row ;col++){
                temp.add(NcR(row,col));
            }
            ans.add(temp);
        }
        return ans;
    }
    public int NcR(int n, int c){
         n = n-1;
         c = c-1;
        long result = 1;
        for(int i = 0;i < c; i++){
            result = result * (n-i);
            result = result/(i +1);
        }
        return (int) result;
    }
}
