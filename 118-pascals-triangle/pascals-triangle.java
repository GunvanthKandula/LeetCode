class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
     for(int row = 1; row <= numRows; row++){
        List<Integer> arr = new ArrayList<>();
             arr = getRow(row);
             ans.add(arr);

        }
        return ans;
    }
    public List<Integer> getRow(int n){
        List<Integer> temp = new ArrayList<>();
        int result = 1;
        temp.add(result);
        for(int i = 1; i < n; i++){
            result = result * (n - i)/i;
            temp.add(result);
        }
        return temp;
    }
}
