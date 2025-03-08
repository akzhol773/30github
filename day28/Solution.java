class Solution {
    public int heightChecker(int[] heights) {

        int res = 0;

        int[] expected = Arrays.copyOf(heights, heights.length);

        Arrays.sort(expected);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                res+=1;
            }
        }

        return res;

    }
}