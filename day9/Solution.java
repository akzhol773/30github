class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        Solution s = new Solution();
        s.reserve(image);
        s.invert(image);
        return image;
    }


    public void reserve(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public void invert(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;

                }
            }
        }


    }

}
