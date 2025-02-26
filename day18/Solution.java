class Solution {
    public String longestPalindrome(String s) {

        if(s.isEmpty()){
            return "";
        }

        int start = 0, maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);

            int maxLen = Math.max(len1, len2);

            if(maxLen > maxLength){
                start = i - (maxLen - 1) / 2;
                maxLength = maxLen;
            }

        }
        return s.substring(start, start + maxLength);

    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}