class Solution {
    public int minElement(int[] nums) {

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            char [] chars = String.valueOf(nums[i]).toCharArray();
            int sum = 0;
            for(int j = 0; j < chars.length; j++){
                sum = sum + Integer.parseInt(String.valueOf(chars[j]));
            }
            res = Math.min(res, sum);
        }
        return res;
    }
}