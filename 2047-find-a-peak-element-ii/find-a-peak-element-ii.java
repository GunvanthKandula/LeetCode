class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Find the row with the maximum element in the middle column
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int leftVal = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int rightVal = (mid < n - 1) ? mat[maxRow][mid + 1] : -1;

            // Peak found
            if (mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal) {
                return new int[]{maxRow, mid};
            }
            // Move left
            else if (leftVal > mat[maxRow][mid]) {
                right = mid - 1;
            }
            // Move right
            else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}