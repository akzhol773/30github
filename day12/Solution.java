class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        boolean res = false;

        for(int i = 0; i < matrix.length; i++){
            int low = 0, high = matrix[i].length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[i][mid] == target)
                    res = true;


                if (matrix[i][mid] < target)
                    low = mid + 1;


                else
                    high = mid - 1;
            }


        }

        return res;

    }
}
