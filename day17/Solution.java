class Solution {

    public int lengthOfLongestSubstring(String s) {

        int left = 0, right = 0, maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left+1);
            right++;

        }

        return maxLength;

    }
}