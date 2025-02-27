class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder st  = new StringBuilder();

        String res = s.toUpperCase().replace("-", "");
        int count = 0;

        for(int i = res.length() - 1; i >= 0; i--){

            st.append(res.charAt(i));
            count++;

            if(count == k && i > 0){
                st.append('-');
                count = 0;
            }
        }

        return st.reverse().toString();

    }
}