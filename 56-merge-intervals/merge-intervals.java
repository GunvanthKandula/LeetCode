class Solution {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int n = intervals.length;
        int i = 0;
        List<int[]> ans = new ArrayList<>();
        while(i<n){
            int Start = intervals[i][0];
            int end = intervals[i][1];
            int j = i +1;
            while( j<n && intervals[j][0] <= end){
                end = Math.max(end,intervals[j][1]);
                j++;
            }
            ans.add(new int[]{Start,end});
             i = j;
        }
        return ans.toArray(new int[ans.size()][0]);
    }
}