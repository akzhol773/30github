class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(cleaned.equals("")){
            return true;
        }

        String rev = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            rev = rev + cleaned.charAt(i);
        }

        return rev.equals(cleaned);
    }
}