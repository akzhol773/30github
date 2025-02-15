class Solution {
    public String defangIPaddr(String address) {

        StringBuilder st = new StringBuilder();
        char[] chars = address.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i]=='.'){
                st.append("[.]");
            }else{
                st.append(chars[i]);
            }

        }
        return st.toString();

    }
}